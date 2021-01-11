package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class CarSheduleDTO {
    private String carSheduleId;
    private java.sql.Timestamp pickupDate;
    private java.sql.Timestamp returnDate;
    private String carId;

    public CarSheduleDTO() {
    }

    public CarSheduleDTO(String carSheduleId, Timestamp pickupDate, Timestamp returnDate, String carId) {
        this.carSheduleId = carSheduleId;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.carId = carId;
    }

    public String getCarSheduleId() {
        return carSheduleId;
    }

    public void setCarSheduleId(String carSheduleId) {
        this.carSheduleId = carSheduleId;
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

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
