package lk.ijse.spring.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class RentDetails {
    @Id
    private String rentDetailsId;
    private boolean driverReq;
    private String startMil;
    private String endMil;
    private java.sql.Timestamp date;
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentId", referencedColumnName = "rentId", nullable = false)
    private Rent rent;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DriverId", referencedColumnName = "driverId", nullable = false)
    private Driver driver;

    @OneToOne(mappedBy = "rentDetails", cascade = CascadeType.ALL)
    private DriverShedule driverShedule;

    public RentDetails() {
    }

    public RentDetails(String rentDetailsId, boolean driverReq, String startMil, String endMil, Timestamp date, String status, Rent rent, Driver driver) {
        this.rentDetailsId = rentDetailsId;
        this.driverReq = driverReq;
        this.startMil = startMil;
        this.endMil = endMil;
        this.date = date;
        this.status = status;
        this.rent = rent;
        this.driver = driver;
    }

    public DriverShedule getDriverShedule() {
        return driverShedule;
    }

    public void setDriverShedule(DriverShedule driverShedule) {
        this.driverShedule = driverShedule;
    }

    public String getRentDetailsId() {
        return rentDetailsId;
    }

    public void setRentDetailsId(String rentDetailsId) {
        this.rentDetailsId = rentDetailsId;
    }

    public boolean isDriverReq() {
        return driverReq;
    }

    public void setDriverReq(boolean driverReq) {
        this.driverReq = driverReq;
    }

    public String getStartMil() {
        return startMil;
    }

    public void setStartMil(String startMil) {
        this.startMil = startMil;
    }

    public String getEndMil() {
        return endMil;
    }

    public void setEndMil(String endMil) {
        this.endMil = endMil;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
