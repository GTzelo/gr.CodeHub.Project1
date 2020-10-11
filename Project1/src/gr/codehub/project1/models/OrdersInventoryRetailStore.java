package gr.codehub.project1.models;

import java.util.ArrayList;


import gr.codehub.project1.models.InventoryRetailStore;

public class OrdersInventoryRetailStore extends InventoryRetailStore {
  
    private ArrayList<Order> orders;

    public OrdersInventoryRetailStore() {
        orders = new ArrayList<>();
    }

    // Method to create new order and add it to the end of orders list
    public Order createOrder(Customer customer, Product product) {
        Order order = new Order(product, customer);

        System.out.println("New order: customer=" + order.getCustomer().getName() + ", product=" + order.getProduct().getName() + ", status=" + order.getDeliveryStatus() + ", date=" + order.getDate());
        orders.add(order);
        return order;
    }

    // Method to get order from the beginning of the list
    public void executeOrder() {
        if(orders.size() != 0) {
            
             Order order = orders.remove(0);
           
             order.setDeliveryStatus(Order.DeliveryStatus.READY);
           
             System.out.println("Order ready: customer=" + order.getCustomer().getName() + ", product=" + order.getProduct().getName() + ", status=" + order.getDeliveryStatus() + ", date=" + order.getDate());
        
        }else {
              System.out.println("There are no new orders.");
        }
    }
}
