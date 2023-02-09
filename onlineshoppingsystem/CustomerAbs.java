package onlineshoppingsystem;

import java.util.List;

public interface CustomerAbs {

    String getName();
    String getAddress();
    void processProduct(Product product);
    List<Product> getProcessProduct();
    void purchasedProduct(Product product);
    List<Product> getPurchasedProduct();
}
