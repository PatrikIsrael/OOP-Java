import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criando vários emails
        Email email1 = new Email("Reunião", "2023-10-01", "chefe@empresa.com");
        Email email2 = new Email("Relatório", "2023-10-02", "colaborador@empresa.com");
        Email email3 = new Email("Pagamento", "2023-10-03", "financeiro@empresa.com");
        Email email4 = new Email("Reunião", "2023-10-04", "chefe@empresa.com"); // Remetente repetido

        // Criando um Set de Emails
        Set<Email> caixaEntrada = new HashSet<>();
        caixaEntrada.add(email1);
        caixaEntrada.add(email2);
        caixaEntrada.add(email3);
        caixaEntrada.add(email4);

        // 1. Extrair remetentes únicos
        Set<String> remetentesUnicos = new HashSet<>();
        for (Email email : caixaEntrada) {
            remetentesUnicos.add(email.getRemetente());
        }

        System.out.println("Remetentes únicos: " + remetentesUnicos);

        // 2.Método ordenado
        Set<String> remetentes = new LinkedHashSet<>();
        for (Email email : caixaEntrada){
            remetentes.add(email.getRemetente());

            System.out.println(remetentes);
        }
        // 3. Verificar se existe email de um remetente específico
        String remetenteBusca = "chefe@empresa.com";
        boolean existe = remetentesUnicos.contains(remetenteBusca);
        System.out.println("Existe email do " + remetenteBusca + "? " + existe);

        // 4. Filtrar emails por remetente
        System.out.println("\nEmails do chefe:");
        caixaEntrada.stream()
                .filter(e -> e.getRemetente().equals("chefe@empresa.com"))
                .forEach(System.out::println);

        // 5. Operações com conjuntos
        Set<String> remetentesImportantes = Set.of(
                "chefe@empresa.com",
                "financeiro@empresa.com"
        );

        // Interseção entre conjuntos
        Set<String> remetentesComuns = new HashSet<>(remetentesUnicos);
        remetentesComuns.retainAll(remetentesImportantes);
        System.out.println("\nRemetentes importantes presentes: " + remetentesComuns);
    }
}