package onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Store implements StoreAbs{

    private List<Product> products;
    private List<Customer> customers;

    Store(){
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addProducts(Product product){
        products.add(product);
    }

    public void addCustomers(Customer customer){
        customers.add(customer);
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public void processOrder(String name, Customer customer){
        Product productsToProcess = null;
        for (Product p : products){
            if (p.getName().equals(name) && p.isAvailable()){
                productsToProcess = p;
            }else {
                System.out.println("This product is not available.");
            }
        }
        if (productsToProcess != null){
            customer.processProduct(productsToProcess);
            System.out.println("Product processed.");
        }else{
            System.out.println("This product is not available.");
        }
    }

    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("Products are empty.");
        }else{
            for (Product p : products){
                System.out.println("Name            : " + p.getName());
                System.out.println("Description     : " + p.getDescription());
                System.out.println("Price           : " + p.getPrice());
                System.out.println("Availability    : " + p.isAvailable());
            }
        }
    }

    public void displayCustomers(){
        if (customers.isEmpty()){
            System.out.println("You have no customers.");
        }else {
            for (Customer c : customers){
                System.out.println("Name            : " + c.getName());
                System.out.println("Address         : " + c.getAddress());
            }
        }
    }
}
