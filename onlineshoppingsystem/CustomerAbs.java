package onlineshoppingsystem;

import java.util.List;

public interface CustomerAbs {

    String getName();
    String getAddress();
    void purchasedProduct(Product product);
    List<Product> getPurchasedProduct();
}
