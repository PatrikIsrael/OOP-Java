public class ContaCorrente {
        private double saldo = 1000;
        private boolean aberta = true;

        public void depositar(double valor){
            saldo += valor;
            System.out.printf("Deposito: %.2f Saldo: %.2f%n ",
                    valor, saldo);
        }

        public void sacar (double valor) throws SaldoInsuficienteException{
            if (!aberta) {
                throw new IllegalStateException("Saque em conta fechada");
            }
            if (valor < 0){
                throw new IllegalArgumentException(
                        "Valor negativo: " + valor + " Saldo: " +saldo
                );
            }
            if (saldo - valor < 0){
               throw new SaldoInsuficienteException(valor, saldo);
            }
            saldo -= valor;
            System.out.printf("Saque: %.2f Saldo: %.2f%n",
                    valor, saldo);
        }

        public double getSaldo() {
            return saldo;
        }
        public void fechar (){
            this.aberta = false;
        }

}
