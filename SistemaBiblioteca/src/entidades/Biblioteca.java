package entidades;

import dados.DadosMockados;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
   private final List<Livro> livros;
   private final List<Usuario> usuarios;
   private final Map<Livro, Usuario> emprestimos;

   public Biblioteca() {
      this.livros = new ArrayList<>();
      this.usuarios = new ArrayList<>();
      this.emprestimos = new HashMap<>();
      carregarDadosIniciais();
   }

   private void carregarDadosIniciais() {
      livros.addAll(DadosMockados.getLivrosIniciais());
      usuarios.addAll(DadosMockados.getUsuariosIniciais());
   }

   public void listarTodosLivros() {
      System.out.println("\n=== LIVROS CADASTRADOS ===");
      livros.forEach(System.out::println);
   }

   public void listarUsuarios() {
      System.out.println("\n=== USUÁRIOS CADASTRADOS ===");
      usuarios.forEach(System.out::println);
   }

   public void emprestarLivro(int idUsuario, int idLivro) {
      Usuario usuario = buscarUsuario(idUsuario);
      Livro livro = buscarLivro(idLivro);

      if (usuario == null || livro == null) {
         System.out.println("❌ Operação falhou: usuário ou livro não encontrado!");
         return;
      }

      if (!livro.isDisponivel()) {
         System.out.println("❌ O livro '" + livro.getTitulo() + "' já está emprestado!");
         return;
      }

      livro.emprestar();
      usuario.emprestarLivro(livro);
      emprestimos.put(livro, usuario);
      System.out.printf("✅ Empréstimo realizado: %s para %s%n",
              livro.getTitulo(), usuario.getNome());
      System.out.println("📅 Data de devolução: " + usuario.getDataDevolucao());
   }

   public void deolverLivro ( int idUsuario){
      Usuario usuario = buscarUsuario((idUsuario));

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

      Livro livro =usuario.getLivroEmprestado();
      livro.devolver();
      usuario.devolverLivro();
      emprestimos.remove(livro);
      System.out.println("✅ Livro devolvido com sucesso!");

   }

   public void renovarEmprestimo(int idUsuario){
      Usuario usuario = buscarUsuario(idUsuario);

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

   private Usuario buscarUsuario(int id) {
      return usuarios.stream()
              .filter(u -> u.getId() == id)
              .findFirst()
              .orElse(null);
   }

   private Livro buscarLivro(int id) {
      return livros.stream()
              .filter(l -> l.getId() == id)
              .findFirst()
              .orElse(null);
   }
}