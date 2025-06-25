package entidades;

public class ContaPoupanca extends ContaBancaria {

        @Override
    public void aplicarRendimentos(){
        double rendimento = saldo * 0.10;
        if (saldo > 0){
            saldo += saldo * rendimento;
            System.out.println("[Conta Poupança] Rendimento: R$" + saldo);
        }else {
            System.out.println("Voce nao tem saldo para render");
        }

    }

}
