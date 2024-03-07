package Projects.ParkingLot;

import Projects.ParkingLot.Controller.InitController;
import Projects.ParkingLot.Repository.*;
import Projects.ParkingLot.Service.Strategy.InitializationService;



public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        GateRepository gateRepository = new GateRepository();


        InitializationService initializationService = new InitializationService(parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository,
                gateRepository);
        InitController initController = new InitController(initializationService);
        initController.init();
        System.out.println("END");
    }

}
