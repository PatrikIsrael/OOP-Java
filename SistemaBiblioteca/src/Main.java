import entidades.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Testando funcionalidades
        System.out.println("\n=== TESTANDO SISTEMA ===");
        biblioteca.listarTodosLivros();
        biblioteca.listarUsuarios();

        System.out.println("\n=== REALIZANDO EMPRÉSTIMOS ===");
        biblioteca.emprestarLivro(1, 2);  // Felipe pega Senhor dos Anéis
        biblioteca.emprestarLivro(3, 5);  // Carlos pega Crime e Castigo

        System.out.println("\n=== TENTANDO EMPRESTAR LIVRO JÁ EMPRESTADO ===");
        biblioteca.emprestarLivro(2, 2);  // Maria tenta pegar Senhor dos Anéis

        System.out.println("\n=== DEVOLUÇÃO ===");
        biblioteca.devolverLivro(2);  // Devolve Senhor dos Anéis

        System.out.println("\n=== SITUAÇÃO FINAL ===");
        biblioteca.listarTodosLivros();
    }
}