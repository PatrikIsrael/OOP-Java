
public class Main {
    public static void main(String[] args) {

        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Cuecas");
        String text = caixaDeString.pegar();

        Caixa<Integer> caixaDeInt = new Caixa<>();
        caixaDeInt.guardar(2);
        int numero = caixaDeInt.pegar();

        System.out.println(caixaDeString.pegar());
        System.out.println(caixaDeInt.pegar());
    }
}