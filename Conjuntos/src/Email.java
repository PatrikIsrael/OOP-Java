

public class Email {
    private String assunto;
    private String data;
    private String remetente;

    // Construtor
    public Email(String assunto, String data, String remetente) {
        this.assunto = assunto;
        this.data = data;
        this.remetente = remetente;
    }


    public String getAssunto() {
        return assunto;
    }

    public String getData() {
        return data;
    }

    public String getRemetente() {
        return remetente;
    }

    // Método toString para melhor visualização
    @Override
    public String toString() {
        return "Email: " + assunto + " | Remetente: " + remetente + " | Data: " + data;
    }
}