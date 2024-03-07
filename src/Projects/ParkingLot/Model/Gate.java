package Projects.ParkingLot.Model;

import Projects.ParkingLot.ENUM.GateStatus;
import Projects.ParkingLot.ENUM.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseModel{

    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Gate() {
    }

    public Gate( int gateNumber, GateStatus gateStatus, GateType gateType, LocalDateTime entryTime, LocalDateTime exitTime) {

        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }



    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
