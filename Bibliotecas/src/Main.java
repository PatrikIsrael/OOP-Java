import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // =============================================
        // 1. CRIAÇÃO E MODIFICAÇÃO DE LISTAS
        // =============================================

        // Criando e populando uma lista de frutas
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");       // Adiciona no final
        frutas.add("Maça");         // ["Banana", "Maça"]
        frutas.add("Melancia");     // ["Banana", "Maça", "Melancia"]
        frutas.add(1, "Morango");   // Adiciona na posição 1: ["Banana", "Morango", "Maça", "Melancia"]
        frutas.set(2, "abacaxi");   // Substitui posição 2: ["Banana", "Morango", "abacaxi", "Melancia"]

        // Convertendo todos elementos para maiúsculas
        frutas.replaceAll(String::toUpperCase);  // ["BANANA", "MORANGO", "ABACAXI", "MELANCIA"]

        // Criando e modificando lista de legumes
        List<String> legumes = new ArrayList<>();
        legumes.add("Beringela");   // ["Beringela"]
        legumes.add("Couve-flor");  // ["Beringela", "Couve-flor"]
        legumes.set(0, "Cebola");   // Substitui primeiro item: ["Cebola", "Couve-flor"]

        // =============================================
        // 2. COMBINAÇÃO DE LISTAS
        // =============================================

        // Criando lista combinada (feira)
        var feira = new ArrayList<>();
        feira.addAll(frutas);       // Adiciona todas frutas
        feira.addAll(0, legumes);   // Adiciona legumes no início

        // =============================================
        // 3. ITERAÇÃO E REMOÇÃO
        // =============================================

        // Iteração básica com for-each
        System.out.println("\nLegumes na feira:");
        for (String legume : legumes) {
            System.out.println(legume);
        }

        // Iteração com Iterator para remoção segura
        Iterator<?> iterador = feira.iterator();
        while(iterador.hasNext()) {
            var item = iterador.next();
            if(item.toString().startsWith("M")) {
                iterador.remove();  // Remove itens que começam com "M"
            }
        }

        // =============================================
        // 4. INFORMAÇÕES SOBRE A LISTA
        // =============================================

        // Obtendo tamanho da lista
        int quantidadeFrutas = frutas.size();
        System.out.println("\nA lista contém " + quantidadeFrutas + " frutas:");
        System.out.println(frutas);

        // =============================================
        // 5. LISTAS IMUTÁVEIS E PESQUISA
        // =============================================

        // Criando lista imutável
        List<String> frutas2 = List.of("Banana", "Maça", "Banana");

        // Buscando posições de elementos
        int primeiraPos = frutas2.indexOf("Banana");    // 0
        int ultimaPos = frutas2.lastIndexOf("Banana");  // 2

        // Verificando se contém todos os elementos
        boolean contemTodos = frutas2.containsAll(List.of("Banana", "Maça"));  // true

        System.out.println("\nResultados da pesquisa:");
        System.out.println("Primeira 'Banana': " + primeiraPos);
        System.out.println("Última 'Banana': " + ultimaPos);
        System.out.println("Contém todos? " + contemTodos);
    }
}