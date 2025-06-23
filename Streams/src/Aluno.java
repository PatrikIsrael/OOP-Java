public class Aluno {

    int matricula;
    String nome;
    int idade;
    int mensalidade;

    public Aluno(int matricula, String nome, int idade, int mensalidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
}
