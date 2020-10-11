package gr.codehub.project1.models;

import java.sql.Date;


public class Order {

    enum DeliveryStatus {
        PROCESSING, READY
    }
    private DeliveryStatus deliveryStatus;
    private Product product;
    private Customer customer;
    private Date date;

    public Order(Product product, Customer customer) {
        deliveryStatus = DeliveryStatus.PROCESSING;
        this.product = product;
        this.customer = customer;
        date = new Date(System.currentTimeMillis());
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
