package Projects.ParkingLot.Model;

import Projects.ParkingLot.ENUM.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {

    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;
    private List<ParkingSpot> parkingSpots;
    private Gate entryGate;
    private Gate exitGate;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNumber, ParkingFloorStatus parkingFloorStatus, List<ParkingSpot> parkingSpots, Gate entryGate, Gate exitGate) {
        this.floorNumber = floorNumber;
        this.parkingFloorStatus = parkingFloorStatus;
        this.parkingSpots = parkingSpots;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
