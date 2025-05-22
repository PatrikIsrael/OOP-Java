import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1. Criação da lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(123, "João", 20));
        alunos.add(new Aluno(456, "Maria", 22));
        alunos.add(new Aluno(789, "Pedro", 21));

        // 2. Conversão para Map (nome → objeto Aluno)
        Map<String, Aluno> alunoMap = new HashMap<>();
        for (Aluno aluno : alunos) {
            alunoMap.put(aluno.getNome(), aluno);
        }

        // 3. Modificação em massa com replaceAll()
        alunoMap.replaceAll((nome,aluno) ->
                new Aluno(
                        aluno.getMatricula(),
                        "Turma 1: " + aluno.getNome(),
                        aluno.getIdade()
                )
        );

        //Utilizando os métodos get ou getOrDefault
        if (alunoMap.containsKey("João")){
            System.out.println("João está no mapa");
        }

        var a1 = alunoMap.get("Marcio");
        System.out.println(a1);

        var a2 = alunoMap.getOrDefault("Vicente", new Aluno(0, "?",0));
        System.out.println(a2);

        var a3 = alunoMap.get("Pedro");
        System.out.println(a3);

        // Iterações
        for (var entry : alunoMap.entrySet()){
            System.out.println("Nome:" + entry.getKey());
            System.out.println("Aluno:" + entry.getValue());
        }

    }
}