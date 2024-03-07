package Projects.ParkingLot.Model;

import Projects.ParkingLot.Model.ParkingSpot;
import Projects.ParkingLot.Model.Ticket;
import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDateTime;

public class Bill extends BaseModel{

    private int amount;
    private Ticket ticket;
    private ParkingSpot parkingSpot;
    private LocalDateTime exitTime;

    public Bill( int amount, Ticket ticket, ParkingSpot parkingSpot, LocalDateTime exitTime) {

        this.amount = amount;
        this.ticket = ticket;
        this.parkingSpot = parkingSpot;
        this.exitTime = exitTime;
    }

    public Bill() {
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
