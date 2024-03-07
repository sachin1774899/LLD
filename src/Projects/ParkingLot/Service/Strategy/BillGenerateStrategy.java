package Projects.ParkingLot.Service.Strategy;

import Projects.ParkingLot.Model.Bill;
import Projects.ParkingLot.Model.Ticket;

public interface BillGenerateStrategy {
    Bill generateBill(Ticket ticket);
}
