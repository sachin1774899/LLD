package Projects.ParkingLot.Service.Strategy;

import Projects.ParkingLot.Model.ParkingSpot;
import Projects.ParkingLot.Model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getVehicleSpot(Vehicle vehicle);
}
