package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.BillStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill {
    private Long id;
    private Ticket ticket;
    private Date exitTime;
    private Gate exitGate;
    private Operator operator;
    private double amount;
    private BillStatus billStatus;
    private List<Payment> payments;

    public Bill(Long id, Ticket ticket, Gate exitGate, Operator operator, double amount) {
        this.id = id;
        this.ticket = ticket;
        this.exitTime = new Date();
        this.exitGate = exitGate;
        this.operator = operator;
        this.amount = amount;
        this.billStatus = BillStatus.PENDING;
        this.payments = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public double getAmount() {
        return amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}
