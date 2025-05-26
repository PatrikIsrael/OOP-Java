package entidades;

public class Livro {
    private String titulo;
    private String autor;
    private int id;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int id, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar(){
        this.disponibilidade = false;
    }
    public void devolver(){
        this.disponibilidade = true;
    }

    @Override
    public String toString(){
        return titulo + " (" + autor + ") - " + (disponibilidade ? "Disponível" : "Emprestado");
    }


}
