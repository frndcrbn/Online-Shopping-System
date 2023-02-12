package onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerAbs{

    private String name, address;
    private List<Product> purchasedProduct;


    Customer(String name, String address){
        this.name = name;
        this.address = address;
        this.purchasedProduct = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public List<Product> getPurchasedProduct(){
        return purchasedProduct;
    }

    public void purchasedProduct(Product product){
        purchasedProduct.add(product);
    }
}
