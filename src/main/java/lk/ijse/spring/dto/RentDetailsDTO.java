package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class RentDetailsDTO {
    private String rentDetailsId;
    private boolean driverReq;
    private String startMil;
    private String endMil;
    private java.sql.Timestamp date;
    private String status;
    private String rentId;
    private String carId;
    private String driverId;

    public RentDetailsDTO() {
    }

    public RentDetailsDTO(String rentDetailsId, boolean driverReq, String startMil, String endMil, Timestamp date, String status, String rentId, String carId, String driverId) {
        this.rentDetailsId = rentDetailsId;
        this.driverReq = driverReq;
        this.startMil = startMil;
        this.endMil = endMil;
        this.date = date;
        this.status = status;
        this.rentId = rentId;
        this.carId = carId;
        this.driverId = driverId;
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

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
