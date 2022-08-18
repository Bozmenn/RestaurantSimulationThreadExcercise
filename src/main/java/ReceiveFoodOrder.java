import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ReceiveFoodOrder implements Callable {

    private FutureTask<String> foodOrderFuture;

    public ReceiveFoodOrder(FutureTask<String> foodOrderFuture) {
        this.foodOrderFuture = foodOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if (foodOrderFuture.get() == "Salad ordered") {
            System.out.println("WAITER : Salad order received.");
            return "Cook Salad";
        } else if (foodOrderFuture.get() == "Soup ordered") {
            System.out.println("WAITER : Soup order received.");
            return "Cook Soup";
        } else if (foodOrderFuture.get() == "Kofte ordered") {
            System.out.println("WAITER : Kofte order received.");
            return "Cook Kofte";
        } else if (foodOrderFuture.get() == "Pasta ordered") {
            System.out.println("WAITER : Pasta order received.");
            return "Cook Pasta";
        } else if (foodOrderFuture.get() == "Chicken wings ordered") {
            System.out.println("WAITER : Chicken wings order received.");
            return "Cook Chicken wings";
        } else if (foodOrderFuture.get() == "Burger ordered") {
            System.out.println("WAITER : Burger order received.");
            return "Cook Burger";
        } else if (foodOrderFuture.get() == "Paella ordered") {
            System.out.println("WAITER : Paella order received.");
            return "Cook Paella";
        } else if (foodOrderFuture.get() == "Pizza ordered") {
            System.out.println("WAITER : Pizza order received.");
            return "Cook Pizza";
        } else if (foodOrderFuture.get() == "Baklava ordered") {
            System.out.println("WAITER : Baklava order received.");
            return "Cook Baklava";
        } else if (foodOrderFuture.get() == "Fanta ordered") {
            System.out.println("WAITER : Fanta order received.");
            return "Cook Fanta";
        }
        return null;
    }
}

