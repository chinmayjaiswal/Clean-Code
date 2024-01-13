package com.misc.test;

import java.util.List;

public class Order {
  int orderId;
  Customer customer;
  List<Product> products;
  String orderDate;

  public int getOrderId() {
    return orderId;
  }

  public Customer getCustomer() {
    return customer;
  }

  public List<Product> getProducts() {
    return products;
  }

  public String getOrderDate() {
    return orderDate;
  }
}
