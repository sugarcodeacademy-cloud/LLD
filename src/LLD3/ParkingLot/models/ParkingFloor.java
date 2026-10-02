package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.ParkingFloorStatus;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private Long id;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor(Long id, int floorNumber) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
        this.parkingFloorStatus = ParkingFloorStatus.OPERATIONAL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
