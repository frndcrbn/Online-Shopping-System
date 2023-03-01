package onlineshoppingsystem;

public class Product implements ProductAbs{

    private String name;
    private String description;
    private float price;
    private boolean availability;
    private String status;

    Product(String name, String description, float price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = true;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public float getPrice(){
        return price;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
