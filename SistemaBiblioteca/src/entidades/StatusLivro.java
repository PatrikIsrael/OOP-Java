package entidades;

public interface StatusLivro {
    void emprestar();
    void devolver();
    boolean isDisponivel();
    String getStatus();
}
