package Projects.ParkingLot.Model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private int id;
    private LocalDateTime entryTime;
    private Gate gate;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket() {
    }

    public Ticket(int id, LocalDateTime entryTime, Gate gate, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.id = id;
        this.entryTime = entryTime;
        this.gate = gate;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
