import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        ExecutorService table = Executors.newFixedThreadPool(5);
        ExecutorService waiter = Executors.newFixedThreadPool(3);
        ExecutorService chief = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 6; i++) {
            FoodOrder foodOrder = FoodOrder.getFoodOrder();

            FutureTask<String> foodOrderFuture = new FutureTask<String>(new FoodOrder(foodOrder.getName()));
            FutureTask<String> ReceiveFoodOrderFuture = new FutureTask<String>(new ReceiveFoodOrder(foodOrderFuture));
            FutureTask<String> cookOrderFuture = new FutureTask<String>(new CookOrder(ReceiveFoodOrderFuture));
            FutureTask<String> receiveCookedOrderFuture = new FutureTask<String>(new ReceiveCookedOrder(cookOrderFuture));
            FutureTask<String> consumeFoodOrder = new FutureTask<String>(new ConsumeFoodOrder(receiveCookedOrderFuture));

            table.execute(foodOrderFuture);
            waiter.execute(ReceiveFoodOrderFuture);
            chief.execute(cookOrderFuture);
            waiter.execute(receiveCookedOrderFuture);
            table.execute(consumeFoodOrder);
        }
    }
}