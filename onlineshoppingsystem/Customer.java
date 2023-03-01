package onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerAbs{

    private String name, email, address;
    private List<Product> orders;

    Customer(String name, String email, String address){
        this.name = name;
        this.email = email;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public List<Product> getOrders(){
        return orders;
    }

    public void purchasedOrder(Product product){
        orders.add(product);
    }

    public float totalPrice(){
        float totalprice = 0;
        for (Product price : orders){
            totalprice += price.getPrice();
        }
        return  totalprice;
    }
}
