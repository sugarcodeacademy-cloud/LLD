package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.GateStatus;
import LLD3.ParkingLot.models.EnumTypes.GateType;

public class Gate {
    private Long id;
    private int gateNum;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(Long id, int gateNum, GateType gateType, Operator operator) {
        this.id = id;
        this.gateNum = gateNum;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus = GateStatus.OPERATIONAL;
    }

    public Long getId() {
        return id;
    }

    public int getGateNum() {
        return gateNum;
    }

    public GateType getGateType() {
        return gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }
}
