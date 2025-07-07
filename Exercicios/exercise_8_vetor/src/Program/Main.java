//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

package Program;

import Entities.Person;

import java.util.Scanner;


public class Main {

    public static void printUnder16Names(Person [] people){
        System.out.println("\nPeople with under age 16");
        for (Person person : people){
            if (person.getAge()< 16){
                System.out.println(person.getName());
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will register? ");
        int n = sc.nextInt();
        Person[] person = new Person[n];
        sc.nextLine();

        for (int i = 0; i < person.length; i++) {
            System.out.println("Date of the " + (i + 1) + " person");
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Age: ");
            int age = sc.nextInt();
            System.out.printf("Height: ");
            double height = sc.nextDouble();

            sc.nextLine();
            person[i] = new Person(name, age, height);

        }

        double sumHeight = 0.0;
        for (int i = 0; i < person.length; i++) {
            sumHeight += person[i].getHeight();
        }

        double avgHeight = person.length > 0 ? sumHeight / person.length : 0.0;
        System.out.printf("Height avg: %.2f%n", avgHeight);

        int totalPeople = person.length;
        int under16Count = 0;

        for (int i = 0; i < totalPeople; i++) {
            if (person[i].isUnder16()) {
                under16Count++;
            }
        }

        double percentage = (totalPeople > 0) ? (under16Count * 100 / totalPeople):  0.0;

        System.out.printf("Percentage of people under 16: %.1f%%%n", percentage);

        printUnder16Names(person);

        sc.close();
    }
}