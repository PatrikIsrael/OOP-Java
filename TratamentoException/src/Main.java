import java.util.Random;

public class Main {

    public void run(){
        Random random = new Random();
        ContaCorrente cc = new ContaCorrente();

        for (int i = 0; i < 10;i++){
            try{
                int valor = 250- random.nextInt(500);
                if (random.nextBoolean()){
                    cc.depositar(valor);
                }else {
                    cc.sacar(valor * 5);
                }
            }catch (IllegalArgumentException | IllegalStateException e ){
                System.err.println("Não realizado: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
     try{
         new Main().run();
     }catch (Exception e){
         System.out.println("Um erro inesperado ocorreu");
         e.printStackTrace();
     }
    }
}