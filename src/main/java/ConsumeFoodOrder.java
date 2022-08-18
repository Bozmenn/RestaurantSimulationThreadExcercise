import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ConsumeFoodOrder implements Callable {

    private FutureTask<String> receiveCookedOrderFuture;

    public ConsumeFoodOrder(FutureTask<String> receiveCookedOrderFuture) {
        this.receiveCookedOrderFuture = receiveCookedOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if (receiveCookedOrderFuture.get() == "Salad order served") {
            Thread.sleep(300);
            System.out.println("TABLE : Salad consumed. Customer left.");
            return "Salad consumed.";
        } else if (receiveCookedOrderFuture.get() == "Soup order served") {
            Thread.sleep(300);
            System.out.println("TABLE : Soup consumed. Customer left.");
            return "Soup consumed.";
        } else if (receiveCookedOrderFuture.get() == "Kofte order served") {
            Thread.sleep(400);
            System.out.println("TABLE : Kofte consumed. Customer left.");
            return "Kofte consumed.";
        } else if (receiveCookedOrderFuture.get() == "Pasta order served") {
            Thread.sleep(250);
            System.out.println("TABLE : Pasta consumed. Customer left.");
            return "Pasta consumed.";
        } else if (receiveCookedOrderFuture.get() == "Chicken wings order served") {
            Thread.sleep(300);
            System.out.println("TABLE : Chicken wings consumed. Customer left.");
            return "Chicken wings consumed.";
        } else if (receiveCookedOrderFuture.get() == "Burger order served") {
            Thread.sleep(500);
            System.out.println("TABLE : Burger consumed. Customer left.");
            return "Burger consumed.";
        } else if (receiveCookedOrderFuture.get() == "Paella order served") {
            Thread.sleep(400);
            System.out.println("TABLE : Paella consumed. Customer left.");
            return "Paella consumed.";
        } else if (receiveCookedOrderFuture.get() == "Pizza order served") {
            Thread.sleep(500);
            System.out.println("TABLE : Pizza consumed. Customer left.");
            return "Pizza consumed.";
        } else if (receiveCookedOrderFuture.get() == "Baklava order served") {
            Thread.sleep(200);
            System.out.println("TABLE : Baklava consumed. Customer left.");
            return "Baklava consumed.";
        } else if (receiveCookedOrderFuture.get() == "Fanta order served") {
            Thread.sleep(100);
            System.out.println("TABLE : Fanta consumed. Customer left.");
            return "Fanta consumed.";
        }
        return null;
    }
}
