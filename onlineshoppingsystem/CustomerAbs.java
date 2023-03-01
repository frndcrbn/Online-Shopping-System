package onlineshoppingsystem;

import java.util.List;

public interface CustomerAbs {

    String getName();
    String getEmail();
    String getAddress();
    List<Product> getOrders();
    void purchasedOrder(Product product);

}
