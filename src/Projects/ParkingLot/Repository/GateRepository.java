package Projects.ParkingLot.Repository;

import Projects.ParkingLot.Exceptions.GateNotFoundException;
import Projects.ParkingLot.Model.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gateHashMap;

    public Gate get(Gate gateId){
        Gate gate = gateHashMap.get(gateId);
        if(gate==null){
            throw new GateNotFoundException("Gate not found "+gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateHashMap.put(gate.getId(), gate);
        System.out.println("Gate has been added Successfully");
    }
}
