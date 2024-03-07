package Projects.ParkingLot.Repository;

import Projects.ParkingLot.Exceptions.ParkingFloorNotFoundException;
import Projects.ParkingLot.Model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorHashMap;

    public ParkingFloor get(ParkingFloor parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorHashMap.get(parkingFloorId);
        if(parkingFloor==null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found "+parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        parkingFloorHashMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor has been added Successfully");
    }
}
