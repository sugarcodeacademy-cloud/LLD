package LLD3.ParkingLot.strategies.feeCalculationStrategy;

import LLD3.ParkingLot.models.ParkingSpot;
import LLD3.ParkingLot.models.Ticket;

public interface FeeCalculationStrategy {
    public double calculateFee(Ticket ticket);
}
