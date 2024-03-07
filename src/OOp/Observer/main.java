package OOp.Observer;

public class main {
    public static void main(String[] args) {
        NotificationService notificationService =new NotificationService();
        GenerateInvoice generateInvoice= new GenerateInvoice();
        Amazon amazon = new Amazon();

        amazon.add_OrderPlaceSubscriber(notificationService);
        amazon.add_OrderPlaceSubscriber(generateInvoice);
        amazon.orderPlaced();
    }
}
