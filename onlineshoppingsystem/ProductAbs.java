package onlineshoppingsystem;

public interface ProductAbs {

    String getName();
    String getDescription();
    float getPrice();
    boolean isAvailable();
    void setAvailability(boolean availability);
}
