import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor.
//Em seguinda: Imprimir todos os elementos do vetor
// Mostrar na tela a soma e a média dos elementos do vetor


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("How manu numbers are you goind to type?");
        int n = sc.nextInt();
        int [] numbers = new int [n];

        for (int i = 0;i < numbers.length; i++){
            System.out.printf("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        double sum = 0.0;
        for (int number : numbers){
          sum += number;

        }
        System.out.printf("Total sum: %.2f%n", sum);
        double avg = sum / numbers.length;
        System.out.printf("Avarage numbers = %.2f%n", avg);

        sc.close();
    }
}