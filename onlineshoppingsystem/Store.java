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

    public void processOrder(Customer customer, Product product){
        if (products.contains(product) && product.isAvailable() ){
            customer.purchasedOrder(product);
            product.setAvailability(false);
            product.setStatus("Pending Status");
        } else {
            System.out.println("This product is not available for purchase.");
        }
    }

    public void shippedOrder(Customer customer, Product product){
        if (products.contains(product) && product.isAvailable()){
            customer.purchasedOrder(product);
            product.setAvailability(false);
            product.setStatus("Shipped");
        } else {
            System.out.println("This product is not available for purchase.");
        }
    }

    public void deliveredOrder(Customer customer, Product product){
        if (products.contains(product) && product.isAvailable()){
            customer.purchasedOrder(product);
            product.setAvailability(false);
            product.setStatus("Delivered");
        } else {
            System.out.println("This product is not available for purchase.");
        }
    }

    public void displayOrder(Customer customer){
        if (customers.isEmpty()){
            System.out.println("You have no customers.");
        } else {
            System.out.println(customer.getName() + "'s Order: ");
            for ( Product p : customer.getOrders()){
                System.out.println("\tProduct(name) : " + p.getName());
                System.out.println("\tProduct(status) : " + p.getStatus());
            }
            System.out.println("\tTotal price : $" + customer.totalPrice());
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
                System.out.println("Availability    : " + (p.isAvailable() ? "Yes" : "No"));
                System.out.println();
            }
        }
    }

    public void displayCustomers(){
        if (customers.isEmpty()){
            System.out.println("You have no customers.");
        }else {
            for (Customer c : customers){
                System.out.println("Name                : " + c.getName());
                System.out.println("Address             : " + c.getAddress());
                System.out.println();
            }
        }
    }
}
