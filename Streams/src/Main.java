import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        // Adicionando 5 alunos à lista
        alunos.add(new Aluno(1001, "João Silva", 9, 850));
        alunos.add(new Aluno(1002, "Maria Oliveira", 22, 900));
        alunos.add(new Aluno(1003, "Carlos Souza", 19, 800));
        alunos.add(new Aluno(1004, "Ana Costa", 21, 950));
        alunos.add(new Aluno(1005, "Pedro Santos", 6, 750));

        // Pipeline de Stream correta
        alunos.stream()
                .filter(a -> a.getIdade() > 9)
                .map(Aluno::getNome)
                .sorted()
                .forEach(System.out::println);

        //Calcular média

        var media = alunos.parallelStream()
                .mapToInt(Aluno::getMensalidade)
                .average()
                .orElse(0.0);

        System.out.printf("Média das mensalidades: R$%.2f%n", media);
    }
}