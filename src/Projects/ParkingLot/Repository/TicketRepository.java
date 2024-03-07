package Projects.ParkingLot.Repository;

import Projects.ParkingLot.Exceptions.TicketNotFoundException;
import Projects.ParkingLot.Model.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> ticketHashMap;

    public TicketRepository() {
        this.ticketHashMap = new HashMap<>();
    }

    public Ticket get(Ticket ticketId){
        Ticket ticket = ticketHashMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket not found "+ticketId);
        }
        return ticket;
    }

    public void put(Ticket ticket){
        ticketHashMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added Successfully");
    }
}
