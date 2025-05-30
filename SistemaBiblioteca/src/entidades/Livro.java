package entidades;

import java.time.LocalDate;

public class Livro implements StatusLivro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private  int ano;
    private boolean disponivel;
    private LocalDate dataDevolucao;

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
    public String getGenero() { return genero; }
    public int getAno() { return ano; }
    public LocalDate getDataDevolucao() { return dataDevolucao; }


    @Override
    public void emprestar() {
        if (!disponivel) {
            throw new IllegalStateException("❌ Livro '" + titulo + "' já está emprestado. Devolução prevista: " + dataDevolucao);
        }
        this.disponivel = false;
        this.dataDevolucao = LocalDate.now().plusDays(7);
    }

    @Override
    public void devolver() {
        this.disponivel = true;
        this.dataDevolucao = null;
    }

    @Override
    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String getStatus() {
        return disponivel
                ? "✅ Disponível"
                : "⛔ Emprestado (Devolver até: " + dataDevolucao + ")";
    }

    @Override
    public String toString() {
        return String.format(
                "%d - %s (%s) - %s | %s",
                id, titulo, autor, genero, getStatus()
        );
    }
}