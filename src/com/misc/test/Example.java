package com.misc.test;

import com.sun.org.apache.xpath.internal.operations.Or;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

  /*

  You are working for an e-commerce platform that deals with a vast range of products across different categories.
  Your task is to design a Java method that efficiently allocates inventory to customers based on their order history.
  Write a Java method with the following signature:
  public static Map<String, Map<Category, List<Product>>> allocateInventoryToCustomers(List<Order> orders, int maxAllocationPerCustomer) {
      // Your code here
  }


  books
  shoes
  cloths

    Product
      - id
      - Category
      - productName
    Order
      - List<Product>
      - customerId

    OrderService
      List<Order> getOrderHistory(customerId)

   InventoryAllocator
        allocateInventoryToCustomers()

   This solution includes the `Order`, `Product`, and `Category` classes along with the
    `InventoryAllocator` class, which contains the `allocateInventoryToCustomers` method.

  new Order("1", "Alice", Arrays.asList(new Product("101", "Laptop", Category.ELECTRONICS),

      new Product("102", "Smartphone", Category.ELECTRONICS),
      new Product("103", "T-Shirt", Category.CLOTHING)

   ---------------------------------------------------------------------------------------------------------
   our task is to write a Java method that takes a list of orders and returns a map that groups orders by category,
   where each category key is mapped to a list of customer names who ordered products from that category.
    Use Java Streams for this task.

  Write a Java method with the following signature:



  public static Map<Category, List<String>> groupCustomersByCategory(List<Order> orders) {
      // Your code here
  }

  list of orders
  groups orders by category

  categorykey --> list<CustomerNames>

   */
  public static void main(String[] args) {

  }

  public static Map<Category, List<String>> groupCustomersByCategory(List<Order> orders) {
    // Your code here
    List<Product> products = orders.stream().map(order -> order.getProducts())
        .flatMap(p -> p.stream()).collect(Collectors.toList());

    List<Category> allCategories = products.stream().map(product -> product.getCategory())
        .distinct()
        .collect(Collectors.toList());

    Map<Category, List<String>> result = allCategories.stream().collect(
        Collectors.toMap(category -> category,
            category -> getCustomerNamesFromOrdersByCategory(category, orders)));

    return result;
  }

  private static List<String> getCustomerNamesFromOrdersByCategory(Category category,
      List<Order> orders) {
    orders.stream().map(order -> {
      order.getProducts().stream()
          .filter(product -> product.getCategory().getId().equals(category.getId()));
    }).collect(Collectors.toList());
    return new ArrayList<>();
  }

}
