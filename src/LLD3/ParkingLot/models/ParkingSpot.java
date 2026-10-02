package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.ParkingSpotStatus;
import LLD3.ParkingLot.models.EnumTypes.VehicleType;

public class ParkingSpot {
    private Long id;
    private int spotNumber;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;

    public ParkingSpot(Long id, int spotNumber, VehicleType vehicleType, Vehicle vehicle, ParkingFloor parkingFloor) {
        this.id = id;
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = ParkingSpotStatus.AVAILABLE;
        this.vehicle = vehicle;
        this.parkingFloor = parkingFloor;
    }

    public Long getId() {
        return id;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }
}
