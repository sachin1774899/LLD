package OOp.Observer;

public class NotificationService implements OrderPlacedSubscribers{

    @Override
    public void orderPlaced() {
        System.out.println("SMS and email notification sent");
    }
}
