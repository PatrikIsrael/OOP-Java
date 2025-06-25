package entidades;

public class ContaCorrente extends ContaBancaria {

    private double calcularTaxa(double valorSaque) {
        return valorSaque <= 100.0 ? 1.0 : 2.0;
    }

    @Override
    public void sacar(double valor){
        double taxa = calcularTaxa(valor);
        double valorTotal = valor + taxa;

        if(saldo > valor){
            saldo -= valorTotal;
            System.out.println(
                    "Saque de R$ " + valor + " realizado " +
                    "Taxa de R$ " + taxa + " debitada. " +
                    "Saldo atual: R$ " + saldo

            );
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void aplicarRendimentos() {
        System.out.println("Conta corrente nao tem rendimentos");
    }

}
