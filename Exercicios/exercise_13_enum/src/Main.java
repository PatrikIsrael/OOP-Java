
//Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
//sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
//o instante do sistema: new Date()

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate  = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order date: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.PEINDING_PAYMENT;

        Order order = new Order(new Date(),status, client);

        System.out.print("How many items to this order: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();

    }
}