package entidades;

import dados.DadosMockados;
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

   public List<Livro> getLivrosDisponiveis() {
      return livros.stream()
              .filter(Livro::isDisponivel)
              .toList();
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
      emprestimos.put(livro, usuario);
      System.out.printf("✅ Empréstimo realizado: %s para %s%n",
              livro.getTitulo(), usuario.getNome());
   }

   public void devolverLivro(int idLivro) {
      Livro livro = buscarLivro(idLivro);

      if (livro == null) {
         System.out.println("❌ Livro não encontrado!");
         return;
      }

      if (livro.isDisponivel()) {
         System.out.println("ℹ️ Este livro já está disponível");
         return;
      }

      livro.devolver();
      emprestimos.remove(livro);
      System.out.println("✅ Livro devolvido com sucesso: " + livro.getTitulo());
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