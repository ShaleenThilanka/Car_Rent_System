package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class DriverSeduleDTO {
    private String driverScheduleId;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
    private String rentDetailsId;
    private String driverId;

    public DriverSeduleDTO() {
    }

    public DriverSeduleDTO(String driverScheduleId, Timestamp startDate, Timestamp endDate, String rentDetailsId, String driverId) {
        this.driverScheduleId = driverScheduleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentDetailsId = rentDetailsId;
        this.driverId = driverId;
    }

    public String getDriverScheduleId() {
        return driverScheduleId;
    }

    public void setDriverScheduleId(String driverScheduleId) {
        this.driverScheduleId = driverScheduleId;
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

    public String getRentDetailsId() {
        return rentDetailsId;
    }

    public void setRentDetailsId(String rentDetailsId) {
        this.rentDetailsId = rentDetailsId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
