package entidades;

public abstract class ContaBancaria {
   protected double saldo;

    public void verSaldo(){
        System.out.println("Saldo Atual: R$" + saldo);
    }

   public void depositar(double valor){
       saldo += valor;
   }

   public void sacar (double valor){
       if (saldo >= valor){
           saldo -= valor;
           System.out.println("Saque de R$ " + valor + " realizado. Novo saldo : R$ " + saldo);
       }else {
           System.out.println("Saldo insuficiente");
       }
   }

   public abstract void aplicarRendimentos();
}
