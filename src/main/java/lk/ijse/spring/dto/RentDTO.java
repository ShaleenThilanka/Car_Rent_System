package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class RentDTO {
    private String rentId;
    private java.sql.Timestamp addedDate;
    private Integer noOfCar;
    private String status;
    private java.sql.Timestamp pickupDate;
    private java.sql.Timestamp returnDate;
    private String pickupLocation;
    private String retunLocation;

    private String customerId;

    public RentDTO() {
    }

    public RentDTO(String rentId, Timestamp addedDate, Integer noOfCar, String status, Timestamp pickupDate, Timestamp returnDate, String pickupLocation, String retunLocation, String customerId) {
        this.rentId = rentId;
        this.addedDate = addedDate;
        this.noOfCar = noOfCar;
        this.status = status;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.pickupLocation = pickupLocation;
        this.retunLocation = retunLocation;
        this.customerId = customerId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
