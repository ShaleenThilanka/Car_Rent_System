package lk.ijse.spring.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Payment {
    @Id
    private String paymentId;
    private String amount;
    private java.sql.Timestamp paymentDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RentId", referencedColumnName = "rentId")
    private Rent rent;

    public Payment() {
    }

    public Payment(String paymentId, String amount, Timestamp paymentDateTime, Rent rent) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDateTime = paymentDateTime;
        this.rent = rent;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Timestamp getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(Timestamp paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
