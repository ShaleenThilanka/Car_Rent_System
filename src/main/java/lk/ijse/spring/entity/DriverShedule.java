package lk.ijse.spring.entity;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class DriverShedule {
    @Id
    private String driverSheduleId;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentDetailsId", referencedColumnName = "rentDetailsId")
    private RentDetails rentDetails;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DriverId", referencedColumnName = "driverId", nullable = false)
    private Driver driver;

    public DriverShedule() {
    }

    public DriverShedule(String driverSheduleId, Timestamp startDate, Timestamp endDate, RentDetails rentDetails, Driver driver) {
        this.driverSheduleId = driverSheduleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentDetails = rentDetails;
        this.driver = driver;
    }

    public String getDriverSheduleId() {
        return driverSheduleId;
    }

    public void setDriverSheduleId(String driverSheduleId) {
        this.driverSheduleId = driverSheduleId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public RentDetails getRentDetails() {
        return rentDetails;
    }

    public void setRentDetails(RentDetails rentDetails) {
        this.rentDetails = rentDetails;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
