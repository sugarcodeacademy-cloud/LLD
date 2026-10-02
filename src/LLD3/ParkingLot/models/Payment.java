package LLD3.ParkingLot.models;

import LLD3.ParkingLot.models.EnumTypes.PaymentStatus;
import LLD3.ParkingLot.models.EnumTypes.PaymentType;

import java.util.Date;

public class Payment {
    private Long id;
    private double amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private String refNumber;
    private Date time;

    public Payment(Long id, double amount, PaymentType paymentType, String refNumber) {
        this.id = id;
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentStatus = PaymentStatus.PENDING;
        this.refNumber = refNumber;
        this.time = new Date();
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public Date getTime() {
        return time;
    }
}
