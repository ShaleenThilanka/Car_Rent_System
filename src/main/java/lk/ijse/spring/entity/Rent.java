package lk.ijse.spring.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rent {
    @Id
    private String rentId;
    private java.sql.Timestamp addedDate;
    private Integer noOfCar;
    private String status;
    private java.sql.Timestamp pickupDate;
    private java.sql.Timestamp returnDate;
    private String pickupLocation;
    private String retunLocation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerID", referencedColumnName = "customerId", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL)
    private List<RentDetails> rentDetails = new ArrayList<>();

    @OneToOne(mappedBy = "payment", cascade = CascadeType.ALL)
    private Payment payment;

    public Rent() {
    }

    public Rent(String rentId, Timestamp addedDate, Integer noOfCar, String status, Timestamp pickupDate, Timestamp returnDate, String pickupLocation, String retunLocation, Customer customer) {
        this.rentId = rentId;
        this.addedDate = addedDate;
        this.noOfCar = noOfCar;
        this.status = status;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.pickupLocation = pickupLocation;
        this.retunLocation = retunLocation;
        this.customer = customer;
    }

    public List<RentDetails> getRentDetails() {
        return rentDetails;
    }

    public void setRentDetails(List<RentDetails> rentDetails) {
        this.rentDetails = rentDetails;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    public Integer getNoOfCar() {
        return noOfCar;
    }

    public void setNoOfCar(Integer noOfCar) {
        this.noOfCar = noOfCar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Timestamp pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getRetunLocation() {
        return retunLocation;
    }

    public void setRetunLocation(String retunLocation) {
        this.retunLocation = retunLocation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
