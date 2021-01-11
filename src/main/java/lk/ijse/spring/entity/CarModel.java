package lk.ijse.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarModel {
    @Id
    private String modelId;
    private String type;
    private String brandName;
    private Integer noOfPassengers;
    private String trnsmissionType;
    private String fuelType;
    private String dailyRate;
    private String monthlyRate;
    private String freeKmDay;
    private String freeKmMonth;
    private Double pricePerDay;
    private Double pricePerMonth;

    @OneToOne(mappedBy = "carmodel", cascade = CascadeType.ALL)
    private Car car;

    public CarModel() {
    }

    public CarModel(String modelId, String type, String brandName, Integer noOfPassengers, String trnsmissionType, String fuelType, String dailyRate, String monthlyRate, String freeKmDay, String freeKmMonth, Double pricePerDay, Double pricePerMonth) {
        this.modelId = modelId;
        this.type = type;
        this.brandName = brandName;
        this.noOfPassengers = noOfPassengers;
        this.trnsmissionType = trnsmissionType;
        this.fuelType = fuelType;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.freeKmDay = freeKmDay;
        this.freeKmMonth = freeKmMonth;
        this.pricePerDay = pricePerDay;
        this.pricePerMonth = pricePerMonth;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Integer noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getTrnsmissionType() {
        return trnsmissionType;
    }

    public void setTrnsmissionType(String trnsmissionType) {
        this.trnsmissionType = trnsmissionType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(String dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(String monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public String getFreeKmDay() {
        return freeKmDay;
    }

    public void setFreeKmDay(String freeKmDay) {
        this.freeKmDay = freeKmDay;
    }

    public String getFreeKmMonth() {
        return freeKmMonth;
    }

    public void setFreeKmMonth(String freeKmMonth) {
        this.freeKmMonth = freeKmMonth;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
