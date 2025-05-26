package entidades;

import java.util.List;

public class Usuario {

    private String nome;
    private int id;
    private List<String> livrosEmprestados;

    public Usuario(String nome, int id, List<String> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void pegarLivroEmprestado(String livro){
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(String livro){
        livrosEmprestados.remove(livro);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getId() {
        return id;
    }
}
