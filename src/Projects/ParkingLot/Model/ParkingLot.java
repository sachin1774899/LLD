package Projects.ParkingLot.Model;

import Projects.ParkingLot.ENUM.ParkingLotStatus;
import Projects.ParkingLot.Service.Strategy.BillGenerateStrategy;
import Projects.ParkingLot.Service.Strategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private int capacity;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private BillGenerateStrategy billGenerateStrategy;
    private SpotAllocationStrategy spotAllocationStrategy;

    public ParkingLot() {
    }

    public ParkingLot( String name, int capacity, String address, List<ParkingFloor> parkingFloors, ParkingLotStatus parkingLotStatus, BillGenerateStrategy billGenerateStrategy, SpotAllocationStrategy spotAllocationStrategy) {

        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.parkingFloors = parkingFloors;
        this.parkingLotStatus = parkingLotStatus;
        this.billGenerateStrategy = billGenerateStrategy;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public BillGenerateStrategy getBillGenerateStrategy() {
        return billGenerateStrategy;
    }

    public void setBillGenerateStrategy(BillGenerateStrategy billGenerateStrategy) {
        this.billGenerateStrategy = billGenerateStrategy;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }
}
