import java.util.*;

public class Customer {
    public List<Dish> orders = new ArrayList<>();
    private String name;

    Customer(String name) {
        this.name = "John";
    }

    public String getName(){
        return name;
    }

    void displayOrders() {
        System.out.println(name + "'s Orders:");
        for (Dish dish : orders) {
            System.out.println("Dish: " + dish.getName());
            System.out.println("ID: " + dish.getId());
            System.out.println("Chef: " + dish.getChef().getName());
            System.out.println("Biography: " + dish.getChef().getBiography());
            System.out.println("------------------------");
        }
    }
}
