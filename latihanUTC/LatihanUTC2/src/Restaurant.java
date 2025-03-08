import java.util.*;
import java.util.Scanner;

public class Restaurant {
    private List<Dish> menu = new ArrayList<>();
    private List<Dish> orders = new ArrayList<>();

    Scanner a = new Scanner(System.in);

    void addDish(Dish dish) {
        menu.add(dish);
        System.out.println("Dish added to menu: " + dish.getName());
    }

    void placeOrder(Customer customer, Dish dish) {
        orders.add(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getName());
    }

    void cancelOrder(Customer customer, Dish dish) {
        orders.remove(dish);
        System.out.println(customer.getName() + " canceled order: " + dish.getName());
    }

    void displayMenu() {
        System.out.println("Menu in Restaurant:");
        for (Dish dish : menu) {
            System.out.println("Dish: " + dish.getName());
            System.out.println("ID: " + dish.getId());
            System.out.println("Chef: " + dish.getChef().getName());
            System.out.println("Biography: " + dish.getChef().getBiography());
            System.out.println("------------------------");
        }
    }
}
