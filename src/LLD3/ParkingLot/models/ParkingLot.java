package LLD3.ParkingLot.models;

import LLD3.ParkingLot.exceptions.InvalidParkingLotException;
import LLD3.ParkingLot.models.EnumTypes.GateType;
import LLD3.ParkingLot.models.EnumTypes.ParkingLotStatus;
import LLD3.ParkingLot.models.EnumTypes.VehicleType;
import LLD3.ParkingLot.strategies.feeCalculationStrategy.FeeCalculationStrategy;
import LLD3.ParkingLot.strategies.spotAllotmentStrategy.SpotAllotmentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private Long id;
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicleType;
    private ParkingLotStatus parkingLotStatus;
    private SpotAllotmentStrategy spotAllotmentStrategy;
    private FeeCalculationStrategy feeCalculationStrategy;

    private ParkingLot(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.parkingFloorList = builder.parkingFloorList;
        this.gates = builder.gates;
        this.allowedVehicleType = builder.allowedVehicleType;
        this.parkingLotStatus = ParkingLotStatus.OPERATIONAL;
        this.spotAllotmentStrategy = builder.spotAllotmentStrategy;
        this.feeCalculationStrategy = builder.feeCalculationStrategy;
    }
    public Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private Long id;
        private String name;
        private String address;
        private List<ParkingFloor> parkingFloorList;
        private List<Gate> gates;
        private List<VehicleType> allowedVehicleType;
        private ParkingLotStatus parkingLotStatus;
        private SpotAllotmentStrategy spotAllotmentStrategy;
        private FeeCalculationStrategy feeCalculationStrategy;


        public Builder() {
            this.parkingFloorList = new ArrayList<>();
            this.gates = new ArrayList<>();
            this.allowedVehicleType = new ArrayList<>();
        }

        public Builder setSpotAllotmentStrategy(SpotAllotmentStrategy spotAllotmentStrategy) {
            this.spotAllotmentStrategy = spotAllotmentStrategy;
            return this;
        }

        public Builder setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
            this.feeCalculationStrategy = feeCalculationStrategy;
            return this;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setParkingFloorList(List<ParkingFloor> parkingFloorList) {
            this.parkingFloorList = parkingFloorList;
            return this;
        }

        public Builder setGates(List<Gate> gates) {
            this.gates = gates;
            return this;
        }

        public Builder setAllowedVehicleType(List<VehicleType> allowedVehicleType) {
            this.allowedVehicleType = allowedVehicleType;
            return this;
        }

        public Builder setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
            this.parkingLotStatus = parkingLotStatus;
            return this;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public List<ParkingFloor> getParkingFloorList() {
            return parkingFloorList;
        }

        public List<Gate> getGates() {
            return gates;
        }

        public List<VehicleType> getAllowedVehicleType() {
            return allowedVehicleType;
        }

        public ParkingLotStatus getParkingLotStatus() {
            return parkingLotStatus;
        }
        public void validate() throws InvalidParkingLotException {
            if(parkingFloorList.isEmpty()){
                throw new InvalidParkingLotException("Parking Lot must have at least one floor");

            }
            if(allowedVehicleType.isEmpty()){
                throw new InvalidParkingLotException("Parking Lot must have at least one vehicle type allowed");

            }
            //TODO: check if at least there is one spot added in each floor
            boolean hasEntryGate = gates.stream().anyMatch(g -> g.getGateType() == GateType.ENTRY);
            if(!hasEntryGate){
                throw new InvalidParkingLotException("Parking Lot should have at least one entry gate");
            }
            boolean hasExitGate = gates.stream().anyMatch(g -> g.getGateType() == GateType.EXIT);
            if(!hasExitGate){
                throw new InvalidParkingLotException("Parking Lot should have at least one exit gate");
            }
            if(spotAllotmentStrategy == null){
                throw new InvalidParkingLotException("Parking lot must has have at least one spot allotment strategy");
            }
            if(feeCalculationStrategy == null){
                throw new InvalidParkingLotException("Parking lot must has have at least one fee calculation strategy");
            }
        }
        public ParkingLot build() throws InvalidParkingLotException {
            //validations
            validate();
            return new ParkingLot(this);
        }
    }
}
/*
Validations
1.At least one parking floor and at least one parking spot in each floor
2.At least one entry gate and one exit gate
3.At least allow one vehicle type
4.strategy for spot allotment
5.fee calculation strategy must be configured to this parking lot
 */

