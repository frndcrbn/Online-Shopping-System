package onlineshoppingsystem;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Online Shopping System");
            System.out.println("[1] Add Product.");
            System.out.println("[2] Add Customer.");
            System.out.println("[3] Processing Orders.");
            System.out.println("[4] List of Processed Orders.");
            System.out.println("[5] Purchased Product.");
            System.out.println("[6] List of Products.");
            System.out.println("[7] List of Customer.");
            System.out.println("[0] Exit.");
            System.out.print("Enter here: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("#Add Product");
                    System.out.print("Enter name:           ");
                    String name_product = scanner.next();
                    System.out.print("Enter description:    ");
                    String desc = scanner.next();
                    System.out.print("Enter price:          ");
                    float price = scanner.nextFloat();
                    scanner.nextLine();
                    store.addProducts(new Product(name_product, desc, price));
                    System.out.println("Product added.");
                    break;
                case 2:
                    System.out.println("#Add Customer");
                    System.out.print("Enter name:       ");
                    String name_customer = scanner.next();
                    System.out.print("Enter address:    ");
                    String address = scanner.next();
                    store.addCustomers(new Customer(name_customer, address));
                    System.out.println("Customer added.");
                    break;
                case 3:
                    System.out.println("#Process Order");
                    System.out.print("Enter Product(name):    ");
                    name_product = scanner.next();
                    System.out.print("Enter Customer(name):   ");
                    name_customer = scanner.next();
                    Customer customer = store.getCustomers().stream().filter(c -> c.getName().equals(name_customer)).findFirst().orElse(null);
                    if( customer != null){
                        store.processOrder(name_product, customer);
                    }else {
                        System.out.println("This product/customer does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("#Processing Orders.");
                    System.out.println("Enter name(Customer): ");
                    name_customer = scanner.next();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("#List of Products");
                    store.displayProducts();
                    break;
                case 7:
                    System.out.println("#List of Customers");
                    store.displayCustomers();
                    break;
                case 0:
                    System.out.println("Thank you for using us.");
                    System.exit(0);
                default:
                    System.out.println("Please select of the choices only.");
                    break;
            }
        }
    }
}
