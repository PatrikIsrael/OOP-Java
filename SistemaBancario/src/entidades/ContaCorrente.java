package entidades;

public class ContaCorrente extends ContaBancaria {

    private double calcularTaxa(double valorSaque) {
        return valorSaque <= 100.0 ? 1.0 : 2.0;
    }

    @Override
    public void sacar(double valor){
        double taxa = calcularTaxa(valor);
        double valorTotal = valor + taxa;

        if(valor > 0 && valorTotal <= saldo){
            saldo -= valorTotal;
            System.out.println(
                    "Saque de R$ " + valor + " realizado " +
                    "Taxa de R$ " + taxa + " debitada. " +
                    "Saldo atual: R$ " + saldo

            );
        }
    }

    @Override
    public void aplicarRendimentos() {
        System.out.println("Conta corrente nao tem rendimentos");
    }

}
