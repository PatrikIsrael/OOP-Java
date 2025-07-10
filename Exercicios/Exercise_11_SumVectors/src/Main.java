import java.util.Arrays;
import java.util.Scanner;
//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many values will wach vector? ");
        int n = sc.nextInt();
        double [] vectA = new double[n];
        double [] vectB = new double[n];
        double [] vectC = new double[n];

        for (int i = 0; i < vectA.length; i++){
            System.out.print("Enter number for vect A " + (i + 1) + ": ");
            vectA[i] = sc.nextDouble();
        }

        for (int j = 0; j < vectB.length;j++){
            System.out.print("Enter number for vect B " + (j + 1) + ": ");
            vectB[j] = sc.nextDouble();
        }

        for (int i = 0; i < vectA.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
        sc.close();
        System.out.println("Sum Vects results: " + Arrays.toString(vectC));
    }
}