package LLD3.ParkingLot.strategies.spotAllotmentStrategy;

import LLD3.ParkingLot.models.EnumTypes.VehicleType;
import LLD3.ParkingLot.models.ParkingFloor;
import LLD3.ParkingLot.models.ParkingSpot;

import java.util.List;

public interface SpotAllotmentStrategy {
    public ParkingSpot allotSpot(VehicleType vehicleType, List<ParkingFloor> floors);
}
