package onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerAbs{

    private String name, address;
    private List<Product> processProduct;
    private List<Product> purchasedProduct;


    Customer(String name, String address){
        this.name = name;
        this.address = address;
        this.processProduct = new ArrayList<>();
        this.purchasedProduct = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void processProduct(Product product){
        processProduct.add(product);
    }

    public List<Product> getProcessProduct(){
        return processProduct;
    }

    public void purchasedProduct(Product product){
        purchasedProduct.add(product);
    }

    public List<Product> getPurchasedProduct(){
        return purchasedProduct;
    }
}
