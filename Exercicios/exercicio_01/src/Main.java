import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();


        Product product = new Product(name, price);
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Update data " + product);

        System.out.println();
        System.out.println("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removerProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();




    }
}