package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.VehicleType;

public class Vehicle {
    private Long id;
    private String licensePlate;
    private String ownerName;
    private VehicleType vehicleType;

    public Vehicle(Long id, String licensePlate, String ownerName, VehicleType vehicleType) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
