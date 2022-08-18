import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CookOrder implements Callable {

    private FutureTask<String> receiveFoodOrderFuture;

    public CookOrder(FutureTask<String> receiveFoodOrderFuture) {
        this.receiveFoodOrderFuture = receiveFoodOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if (receiveFoodOrderFuture.get() == "Cook Salad") {
            Thread.sleep(200);
            System.out.println("CHIEF : Salad order prepared.");
            return "Take Salad order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Soup") {
            Thread.sleep(250);
            System.out.println("CHIEF : Soup order prepared.");
            return "Take Soup order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Kofte") {
            Thread.sleep(250);
            System.out.println("CHIEF : Kofte order prepared.");
            return "Take Kofte order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Pasta") {
            Thread.sleep(150);
            System.out.println("CHIEF : Pasta order prepared.");
            return "Take Pasta order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Chicken wings") {
            Thread.sleep(250);
            System.out.println("CHIEF : Chicken wings order prepared.");
            return "Take Chicken wings order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Burger") {
            Thread.sleep(300);
            System.out.println("CHIEF : Burger order prepared.");
            return "Take Burger order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Paella") {
            Thread.sleep(500);
            System.out.println("CHIEF : Paella order prepared.");
            return "Take Paella order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Pizza") {
            Thread.sleep(350);
            System.out.println("CHIEF : Pizza order prepared.");
            return "Take Pizza order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Baklava") {
            Thread.sleep(100);
            System.out.println("CHIEF : Baklava order prepared.");
            return "Take Baklava order to table";
        } else if (receiveFoodOrderFuture.get() == "Cook Fanta") {
            Thread.sleep(25);
            System.out.println("CHIEF : Fanta order prepared.");
            return "Take Fanta order to table";
        }
        return null;
    }
}
