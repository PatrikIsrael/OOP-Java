// è uma excessão verificada o programador precisa fazer.
// classe filha de exception.

public class SaldoInsuficienteException extends Exception{
    private double valor;
    private double saldo;

    public SaldoInsuficienteException(double valor, double saldo) {
        super("Saldo insuficiente. Valor: " + valor + "Saldo: " + saldo);
    }

    public double getValor() {
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
