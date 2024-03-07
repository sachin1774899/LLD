package OOp.Observer;

public class GenerateInvoice implements OrderPlacedSubscribers{

    @Override
    public void orderPlaced() {
        System.out.println("Invoice Bill Generated");
    }
}
