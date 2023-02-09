package onlineshoppingsystem;

import java.util.List;

public interface StoreAbs {

    void addProducts(Product product);
    void addCustomers(Customer customer);
    List<Product> getProducts();
    List<Customer> getCustomers();
    void processOrder(String name, Customer customer);
    void displayProducts();
    void displayCustomers();
}
