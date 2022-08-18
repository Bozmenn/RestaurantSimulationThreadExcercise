import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FoodOrder implements Callable {
    private String name;

    public FoodOrder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static FoodOrder getFoodOrder() {
        List<String> orderList = new ArrayList<>();
        orderList.add("Salad order");
        orderList.add("Soup order");
        orderList.add("Kofte order");
        orderList.add("Pasta order");
        orderList.add("Chicken wings order");
        orderList.add("Burger order");
        orderList.add("Paella order");
        orderList.add("Pizza order");
        orderList.add("Baklava order");
        orderList.add("Fanta order");
        Random random = new Random();
        orderList.get(random.nextInt(0, 8));
        return new FoodOrder(orderList.get(random.nextInt(0, 8)));
    }

    @Override
    public Object call() throws Exception {
        if (getName() == "Salad order") {
            System.out.println("TABLE : Salad ordered.");
            return "Salad ordered";
        } else if (getName() == "Soup order") {
            System.out.println("TABLE : Soup ordered.");
            return "Soup ordered";
        } else if (getName() == "Kofte order") {
            System.out.println("TABLE : Kofte ordered.");
            return "Kofte ordered";
        } else if (getName() == "Pasta order") {
            System.out.println("TABLE : Pasta ordered.");
            return "Pasta ordered";
        } else if (getName() == "Chicken wings order") {
            System.out.println("TABLE : Chicken wings ordered.");
            return "Chicken wings ordered";
        } else if (getName() == "Burger order") {
            System.out.println("TABLE : Burger ordered.");
            return "Burger ordered";
        } else if (getName() == "Paella order") {
            System.out.println("TABLE : Paella ordered.");
            return "Paella ordered";
        } else if (getName() == "Pizza order") {
            System.out.println("TABLE : Pizza ordered.");
            return "Pizza ordered";
        } else if (getName() == "Baklava order") {
            System.out.println("TABLE : Baklava ordered.");
            return "Baklava ordered";
        } else if (getName() == "Fanta order") {
            System.out.println("TABLE : Fanta ordered.");
            return "Fanta ordered";
        }
        return null;
    }
}
