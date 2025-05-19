import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando lista de planetas
        Lista<Planeta> planetas = new Lista<>(Arrays.asList(
                new Planeta("Netuno", false),
                new Planeta("Marte", false),
                new Planeta("Terra", true),
                new Planeta("Naboo", true)
        ));

        // 1. Critérios básicos
        Criterio<Planeta> comN = p -> p.getNomePlaneta().startsWith("N");
        Criterio<Planeta> habitavel = Planeta::isHabitavel;
        Criterio<Planeta> nomeGrande = p -> p.getNomePlaneta().length() > 5;

        // 2. Combinação de critérios
        Criterio<Planeta> habitavelComN = comN.and(habitavel);
        Criterio<Planeta> naoHabitavel = habitavel.negate();
        Criterio<Planeta> complexo = habitavel.or(nomeGrande.negate());

        // 3. Critérios estáticos
        Criterio<Planeta> todos = Criterio.sempre();
        Criterio<Planeta> nenhum = Criterio.nunca();

        // 4. Critério com parâmetro dinâmico
        Criterio<Planeta> comLetra = Criterio.criar(
                (Planeta p, String letra) -> p.getNomePlaneta().startsWith(letra),
                "M"
        );

        // Aplicando os critérios
        System.out.println("Planetas que começam com N: " + planetas.coletar(comN));
        System.out.println("Planetas habitáveis: " + planetas.coletar(habitavel));
        System.out.println("Planetas habitáveis que começam com N: " + planetas.coletar(habitavelComN));
        System.out.println("Planetas não habitáveis: " + planetas.coletar(naoHabitavel));
        System.out.println("Planetas com M: " + planetas.coletar(comLetra));
        System.out.println("Critério complexo: " + planetas.coletar(complexo));

        // 5. Usando com Streams diretamente
        List<Planeta> filtrados = planetas.toList().stream()
                .filter(complexo.toPredicate())
                .toList();

        System.out.println("Filtrados com Stream: " + filtrados);
    }
}