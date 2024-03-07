package Projects.ParkingLot.Model;

import Projects.ParkingLot.ENUM.PaymentMode;
import Projects.ParkingLot.ENUM.PaymentStatus;

public class Payment extends BaseModel{

    private int amount;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Bill bill;
    private int refNumber;


}
