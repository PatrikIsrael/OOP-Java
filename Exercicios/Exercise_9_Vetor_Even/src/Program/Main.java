package Program;

import java.util.Scanner;
//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type? ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] pair = new int[n];
        int qtdPair = 0;
        sc.nextLine();

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();

            if (num[i] % 2 == 0) {
                pair[qtdPair] = num[i];
                qtdPair++;
            }
        }
            System.out.printf("Numbers pairs: ");
            for (int i = 0; i < qtdPair; i++) {
                System.out.println(pair[i]);
            }

        System.out.printf("Total numbers pairs:  " + qtdPair);
    }
}