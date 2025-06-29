package program;

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

import entities.CalcRetangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcRetangle retangle = new CalcRetangle();
        System.out.println("Enter rectangle width and height: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.println(retangle);

    }
}