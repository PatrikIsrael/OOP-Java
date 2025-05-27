package entidades;

import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private List<String> livrosEmprestados;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
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
