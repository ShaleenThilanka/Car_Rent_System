package lk.ijse.spring.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class CarShedule {
    @Id
    private String carSheduleId;
    private java.sql.Timestamp pickupDate;
    private java.sql.Timestamp returnDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CarId", referencedColumnName = "carId", nullable = false)
    private Car car;

    public CarShedule() {
    }

    public CarShedule(String carSheduleId, Timestamp pickupDate, Timestamp returnDate, Car car) {
        this.carSheduleId = carSheduleId;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.car = car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
