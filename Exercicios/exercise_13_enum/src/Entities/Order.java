package Entities;

import Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem (OrderItem order){
        items.add(order);
    }

    public void removeItem(OrderItem order){
        items.remove(order);
    }

    private double total(){
        double sum = 0.0;
        for (OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) +  "\n");
        sb.append("Order status: ");
        sb.append(status +  "\n");
        sb.append("Client: ");
        sb.append(client +  "\n");
        sb.append("Order items: \n");
        for(OrderItem item : items){
            sb.append(item +  "\n");
            }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }
}
