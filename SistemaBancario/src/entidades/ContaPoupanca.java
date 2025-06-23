package entidades;

public class ContaPoupanca extends ContaBancaria {

        @Override
    public void aplicarRendimentos(){
        double rendimento = saldo * 1.0;
        saldo += saldo * rendimento;
        System.out.println("[Conta Poupança] Rendimento: R$" + rendimento);
    }

}
