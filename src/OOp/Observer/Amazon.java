package OOp.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscribers> orderPlacedSubscribers;

    public Amazon(){
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public void orderPlaced(){
        for(OrderPlacedSubscribers o: orderPlacedSubscribers){
            o.orderPlaced();
        }
    }
    public void add_OrderPlaceSubscriber(OrderPlacedSubscribers orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeOrderPlaceSubscriber(OrderPlacedSubscribers orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
}
