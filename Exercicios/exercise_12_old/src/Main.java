import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you register: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " data");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = Integer.parseInt(sc.nextLine());
        }

        int olderIndex = 0;
        for (int i = 1; i < n; i++) {
            if (ages[i] > ages[olderIndex]) {
                olderIndex = i;
            }
        }

        System.out.println("Older person: " + names[olderIndex]);
        sc.close();
    }
}