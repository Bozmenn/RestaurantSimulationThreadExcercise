import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ReceiveCookedOrder implements Callable {

    private FutureTask<String> cookOrderFuture;

    public ReceiveCookedOrder(FutureTask<String> cookOrderFuture) {
        this.cookOrderFuture = cookOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if (cookOrderFuture.get() == "Take Salad order to table") {
            System.out.println("WAITER : Taking Salad order to table");
            return "Salad order served";
        } else if (cookOrderFuture.get() == "Take Soup order to table") {
            System.out.println("WAITER : Taking Soup order to table");
            return "Soup order served";
        } else if (cookOrderFuture.get() == "Take Kofte order to table") {
            System.out.println("WAITER : Taking Kofte order to table");
            return "Kofte order served";
        } else if (cookOrderFuture.get() == "Take Pasta order to table") {
            System.out.println("WAITER : Taking Pasta order to table");
            return "Soup Pasta served";
        } else if (cookOrderFuture.get() == "Take Chicken wings order to table") {
            System.out.println("WAITER : Taking Chicken wings order to table");
            return "Chicken wings order served";
        } else if (cookOrderFuture.get() == "Take Burger order to table") {
            System.out.println("WAITER : Taking Burger order to table");
            return "Burger order served";
        } else if (cookOrderFuture.get() == "Take Paella order to table") {
            System.out.println("WAITER : Taking Paella order to table");
            return "Paella order served";
        } else if (cookOrderFuture.get() == "Take Pizza order to table") {
            System.out.println("WAITER : Taking Pizza order to table");
            return "Pizza order served";
        } else if (cookOrderFuture.get() == "Take Baklava order to table") {
            System.out.println("WAITER : Taking Baklava order to table");
            return "Baklava order served";
        } else if (cookOrderFuture.get() == "Take Fanta order to table") {
            System.out.println("WAITER : Taking Fanta order to table");
            return "Fanta order served";
        }
        return null;
    }
}
