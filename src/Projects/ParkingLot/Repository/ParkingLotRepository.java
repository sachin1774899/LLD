package Projects.ParkingLot.Repository;

import Projects.ParkingLot.Exceptions.ParkingLotNotFoundException;
import Projects.ParkingLot.Model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private static int IdCounter=0;
    private HashMap<Integer, ParkingLot> parkingLotHashMap;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
    }

    public ParkingLot get(ParkingLot parkingLotId){
        ParkingLot parkingLot =  parkingLotHashMap.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("ParkingLot not found "+parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLot.setId(++IdCounter);
        parkingLotHashMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added Successfully");
    }
}
