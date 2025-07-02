package program;

import entities.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Enter your name: ");
        student.name = sc.nextLine();
        System.out.println("Type the first note: ");
        student.note1 = sc.nextInt();
        System.out.println("Type the second note: ");
        student.note2 = sc.nextInt();
        System.out.println("Type the third note: ");
        student.note3 = sc.nextInt();

        student.verificarNotas();

    }
}