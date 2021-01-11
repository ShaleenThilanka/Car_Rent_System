package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class PaymentDTO {
    private String paymentId;
    private String amount;
    private java.sql.Timestamp paymentDateTime;
    private String rentId;

    public PaymentDTO() {
    }

    public PaymentDTO(String paymentId, String amount, Timestamp paymentDateTime, String rentId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDateTime = paymentDateTime;
        this.rentId = rentId;
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

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }
}
