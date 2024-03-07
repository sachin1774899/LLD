package Projects.ParkingLot.Service.Strategy;
import Projects.ParkingLot.Model.ParkingLot;
import Projects.ParkingLot.Repository.*;

public class InitializationService {
    private ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    private TicketRepository ticketRepository = new TicketRepository();
    private GateRepository gateRepository = new GateRepository();

    public InitializationService(ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, GateRepository gateRepository) {
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
    }

    public void init(){
        ParkingLot parkingLot = new ParkingLot();
    }
}
