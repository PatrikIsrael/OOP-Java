package entidades;

public class Livro {
    private final int id;
    private final String titulo;
    private final String autor;
    private final String genero;
    private final int ano;
    private boolean disponivel;

    public Livro(int id, String titulo, String autor, String genero, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.disponivel = true;
    }


    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponivel() { return disponivel; }


    public void emprestar() { this.disponivel = false; }
    public void devolver() { this.disponivel = true; }

    @Override
    public String toString() {
        return String.format("%d - %s (%s) - %s | %s",
                id, titulo, autor, genero,
                disponivel ? "✅ Disponível" : "⛔ Emprestado");
    }
}