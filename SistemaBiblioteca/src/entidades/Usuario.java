package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Usuario {


    private String nome;
    private String email;
    private Livro livroEmprestado;
    private LocalDate dataDevolucao;

    public Usuario() {
        this.nome = nome;
        this.email = email;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean temLivroEmprestado() {
        return livroEmprestado != null;
    }

    public void emprestarLivro(Livro livro) {
        if (temLivroEmprestado()) {
            throw new IllegalStateException("Usuário já tem livro emprestado");
        }
        this.livroEmprestado = livro;
        this.dataDevolucao = LocalDate.now().plusDays(7);
    }

    public Livro devolverLivro() {
        if (!temLivroEmprestado()) {
            throw new IllegalStateException("Usuário não tem livro para devolver");
        }
        Livro livroDevolvido = livroEmprestado;
        this.livroEmprestado = null;
        this.dataDevolucao = null;
        return livroDevolvido;
    }

    public boolean temAtraso() {
        return dataDevolucao != null && LocalDate.now().isAfter(dataDevolucao);
    }

    public double calcularMulta() {
        if (temAtraso()) {
            long diasAtraso = ChronoUnit.DAYS.between(dataDevolucao, LocalDate.now());
            return diasAtraso * 2.50; // R$ 2,50 por dia de atraso
        }
        return 0;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }


    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

}