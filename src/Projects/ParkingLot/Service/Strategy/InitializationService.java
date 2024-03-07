package Projects.ParkingLot.Service.Strategy;
import Projects.ParkingLot.ENUM.*;
import Projects.ParkingLot.Model.Gate;
import Projects.ParkingLot.Model.ParkingFloor;
import Projects.ParkingLot.Model.ParkingLot;
import Projects.ParkingLot.Model.ParkingSpot;
import Projects.ParkingLot.Repository.*;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;


    public InitializationService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public void init(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setName("Korum Mall ParkingLot");
        parkingLot.setAddress("Manpada road , Dombivli");
        parkingLot.setCapacity(100);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);


        ArrayList<ParkingFloor> floor = new ArrayList<>();
        for(int i=1; i<=10; i++){

            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i*1000+1);
            parkingFloor.setFloorNumber(i*100+1);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            parkingLot.setVehicleTypes(List.of(VehicleType.CAR,VehicleType.BIKE));

            ArrayList<ParkingSpot> spots = new ArrayList<>();

            for(int j=1; i<=10; i++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber(j+1);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                parkingSpot.setVehicleType(VehicleType.CAR);
                spots.add(parkingSpot);
                parkingFloor.setParkingSpots(spots);
                parkingSpotRepository.put(parkingSpot);
            }
            Gate entryGate = new Gate();
            entryGate.setId((i*10000)+1);
            entryGate.setGateNumber(i*10+1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*10000)+2);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setGateNumber(i*10+2);
            exitGate.setGateStatus(GateStatus.OPEN);
            gateRepository.put(exitGate);

            parkingFloor.setExitGate(exitGate);
            floor.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
        }
        parkingLot.setParkingFloors(floor);
        parkingLotRepository.put(parkingLot);
    }
}
