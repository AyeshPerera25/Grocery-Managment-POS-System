/*
 * Copyright (c) All Right Reserved to Ayesh Perera
 */

package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Order {

    private String order;
    private Date orderDate;
    private Customer customer;
    private Item item;

    public Order() {
    }

    public Order(String order, Date orderDate, Customer customer, Item item) {
        this.order = order;
        this.orderDate = orderDate;
        this.customer = customer;
        this.item = item;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
