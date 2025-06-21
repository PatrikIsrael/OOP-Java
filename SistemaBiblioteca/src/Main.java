import java.util.Scanner;
import entidades.Biblioteca;
import entidades.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        int userId = -1;

        while (true) {
            if (userId == -1) {
                System.out.println("\n=== MENU PRINCIPAL ===");
                System.out.println("1. Cadastrar usuário");
                System.out.println("2. Entrar");
                System.out.println("3. Sair");
                System.out.print("Escolha: ");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("\nNome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        userId = Integer.parseInt(String.valueOf(biblioteca.cadastrarUsuario(nome, email)));
                        System.out.println("✅ Cadastro realizado! ID: " + userId);
                        break;
                    case 2:
                        System.out.print("\nDigite seu ID: ");
                        userId = scanner.nextInt();
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                System.out.println("\n=== BIBLIOTECA ===");
                System.out.println("1. Listar livros disponíveis");
                System.out.println("2. Pegar livro emprestado");
                System.out.println("3. Devolver livro");
                System.out.println("4. Renovar empréstimo");
                System.out.println("5. Ver meu livro atual");
                System.out.println("6. Sair");
                System.out.print("Escolha: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        biblioteca.listarTodosLivros();
                        break;
                    case 2:
                        System.out.print("ID do livro: ");
                        int livroId = scanner.nextInt();
                        biblioteca.emprestarLivro((userId), livroId);
                        break;
                    case 3:
                        biblioteca.deolverLivro(String.valueOf(userId));
                        break;
                    case 4:
                        biblioteca.renovarEmprestimo(String.valueOf(userId));
                        break;
                    case 5:
                        biblioteca.verLivroAtualPorUsuario(Integer.parseInt(String.valueOf(userId)));
                        break;
                    case 6:
                        userId = -1;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
    }
}