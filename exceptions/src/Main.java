//Nesse trecho elaborei um código para fazer 10 operações randomicas,
//e na classe conta corrente, fiz as excessões para caso for inválido as operações,
// o programa irá parar.

import java.util.Random;

public class Main {

    public void run(){
        Random random = new Random();
        ContaCorrente cc = new ContaCorrente();
        for (int i = 0; i < 10; i++){
            int valor = 250 - random.nextInt(500);
            if (random.nextBoolean()){
                cc.depositar(valor);
            }else {
                cc.sacar( valor * 5);
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();

    }
}