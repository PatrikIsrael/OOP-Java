package Entities;

import Enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {


    private Date moment;
    private OrderStatus status;
    private List<OrderStatus> statusList = new ArrayList<>();
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, List<OrderStatus> statusList) {
        this.moment = new Date();
        this.status = OrderStatus.PEINDING_PAYMENT;
        this.statusList.add(this.status);
    }

    public void changeStatus(OrderStatus newStatus){
        this.status = newStatus;
        this.statusList.add(newStatus);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        if (!statusList.contains(status)){
            statusList.add(status);
        }
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderStatus> getStatusList() {
        return statusList;
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



}
