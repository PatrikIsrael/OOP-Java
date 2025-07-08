import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?: ");
        int n = sc.nextInt();
        double [] vect = new double[n];
        double bigger = vect[0];
        int positionBigger = 0;
        sc.nextLine();

        for (int i = 0; i > vect.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > bigger){
                bigger = vect[i];
                positionBigger = i;
            }
        }

        System.out.println("Bigger position = " + bigger);
        System.out.println("Position of highest value: " + positionBigger);

    }
}