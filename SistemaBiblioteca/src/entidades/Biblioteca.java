package entidades;

import dados.DadosMockados;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
   private final List<Livro> livros;
   private Map<String, Usuario> usuarios;
   private final Map<Livro, Usuario> emprestimos;
   private Map<Integer, Livro> livroAtualPorUsuario;

   public Biblioteca() {
      this.livros = new ArrayList<>();
      this.usuarios = new HashMap<>();
      this.emprestimos = new HashMap<>();
      this.livroAtualPorUsuario = new HashMap<>();
      carregarLivros();
   }

   private void carregarLivros() {
      livros.addAll(DadosMockados.getLivrosIniciais());
//      usuarios.addAll(DadosMockados.getUsuariosIniciais());
   }

   public int cadastrarUsuario(String nome, String email){
      Objects.requireNonNull(nome, "Nome não pode ser nulo");
      Objects.requireNonNull(email, "E-mail não pode ser nulo");

      nome = nome.trim();
      if (nome.isEmpty()){
         throw new IllegalArgumentException("Nome não pode ser vazio");
      }

      if (!email.contains("@")){
         throw new IllegalArgumentException("E-mail inválido");
      }

      if (emailJaCadastrado(email)){
         throw new IllegalArgumentException("E-mail já cadastrado");
      }

      int id = gerarId();
      Usuario novousuario = new Usuario();
      usuarios.put(String.valueOf(id), novousuario);
       return id;
   }

   public boolean emailJaCadastrado(String email) {
      return usuarios.values().stream()
              .anyMatch(usuario -> usuario.getEmail().equalsIgnoreCase(email));
   }


   private int gerarId() {
      return usuarios.size() + 1;
   }

   public Usuario buscarUsuario(String id){
      return usuarios.get(id);
   }


   public void listarTodosLivros() {
      System.out.println("\n=== LIVROS CADASTRADOS ===");
      livros.forEach(livro -> {
         System.out.println(livro+ " - " +
                 (livro.isDisponivel() ? "Disponível" : "Emprestado"));
      });
   }

   private Livro buscarLivro(int id) {
      return livros.stream()
              .filter(l -> l.getId() == id)
              .findFirst()
              .orElseThrow(() -> new IllegalArgumentException("Livro não encontrado!"));
   }


   public void emprestarLivro(int usuarioId, int livroId) {
      String usuarioIdStr = String.valueOf(usuarioId);
      Usuario usuario = buscarUsuario(usuarioIdStr);
      if (usuario == null){
         throw new IllegalArgumentException("Usuário não encontrado!");
      }

      Livro livro = buscarLivro(livroId);
      if (!livro.isDisponivel()){
         throw new IllegalArgumentException("O livro '" + livro.getTitulo() + "' já está emprestado!");
      }

      if (usuario.temLivroEmprestado()){
         throw new IllegalArgumentException("Usuário já possui um livro emprestado!");
      }

      livro.emprestar();
      usuario.emprestarLivro(livro);
      emprestimos.put(livro, usuario);
      livroAtualPorUsuario.put(Integer.valueOf(usuarioIdStr), livro);
   }


   public void deolverLivro ( String id){
      Usuario usuario = buscarUsuario((id));
      if (usuario == null){
         throw new IllegalArgumentException("Usu[ario não encontrado");
      }

      if (!usuario.temLivroEmprestado()){
         System.out.println("ℹ️ Você não tem livros para devolver");
      }
      Livro livro = usuario.getLivroEmprestado();

      if (usuario.temAtraso()){
         double multa = usuario.calcularMulta();
         System.out.println("⚠️ Devolução atrasada! Multa: R$ " + String.format("%.2f", multa));
      }

      livro.devolver();
      usuario.devolverLivro();
      emprestimos.remove(livro);
      System.out.println("✅ Livro devolvido com sucesso!");

   }

   public void renovarEmprestimo(String id){
      Usuario usuario = buscarUsuario(id);
      if (usuario == null){
         System.out.println("❌ Usuário não encontrado!");
         return;
      }

      if (!usuario.temLivroEmprestado()){
         System.out.println("ℹ️ Você não tem livros para devolver");
      }

      if (usuario.temAtraso()){
         double multa = usuario.calcularMulta();
         System.out.println("⚠️ Devolução atrasada! Multa: R$ " + String.format("%.2f", multa));
      }

      usuario.setDataDevolucao(LocalDate.now().plusDays(7));
      System.out.println("🔄 Empréstimo renovado! Nova data: " + usuario.getDataDevolucao());

   }

   public Livro verLivroAtualPorUsuario(int usuarioId) {
      String usuarioIdStr = String.valueOf(usuarioId);
      if (!usuarios.containsKey(usuarioIdStr)) {
         throw new IllegalArgumentException("Usuário não encontrado!");
      }
      return livroAtualPorUsuario.get(usuarioIdStr);
   }


}