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
            customer.purchasedProduct(product);
            product.setAvailability(false);
        } else {
            System.out.println("This product is not available for purchase.");
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
                if (products.isEmpty()){
                    System.out.println("You have not purchased any products");
                } else {
                    System.out.println("Purchased Products  : ");
                    for (Product p : c.getPurchasedProduct()){
                        System.out.println("\t" + p.getName());
                    }
                }
                System.out.println();
            }
        }
    }
}
