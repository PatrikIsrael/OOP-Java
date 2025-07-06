/*Faça um programa que leia um número inteiro positivo N (máximo = 10)
e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");
        int n = sc.nextInt();

        if (n <= 0 ||  n > 10){
            return ;
        }
        int[] numbers = new int [n];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negative Numbers: ");
        boolean hasNegative = false;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                System.out.println(numbers[i]);
                hasNegative = true;
            }

        }

        if (!hasNegative){
            System.out.println("No negative numbers ware antered.");
        }
        sc.close();
    }
}
