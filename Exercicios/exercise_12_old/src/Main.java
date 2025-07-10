import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will you register: ");
        int n = sc.nextInt();
        String [] vectName = new String[n];
        double [] vectAge = new double[n];
        String [] vectOlder= new String[n];

        for (int i= 0; i < vectName.length; i++){
            System.out.println("Person " +(i + 1) +"data");
            System.out.print("Name: ");
            vectName[i] = sc.nextLine();
            System.out.print("Age: ");
            vectAge[i] = sc.nextDouble();
        }
        for (int i = 0)
        System.out.println("Older Person: ");
        sc.close();

    }
}