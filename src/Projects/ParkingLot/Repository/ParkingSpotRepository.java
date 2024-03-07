package Projects.ParkingLot.Repository;

import Projects.ParkingLot.Exceptions.ParkingSpotNotFoundException;
import Projects.ParkingLot.Model.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private HashMap<Integer, ParkingSpot> parkingSpotHashMap;

    public ParkingSpot get(ParkingSpot parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotHashMap.get(parkingSpotId);
        if(parkingSpot==null){
            throw new ParkingSpotNotFoundException("ParkingSpot not found "+parkingSpotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        parkingSpotHashMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been added");
    }
}
