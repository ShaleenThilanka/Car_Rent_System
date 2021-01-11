package lk.ijse.spring.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {
    @Id
    private String carId;
    private String milege;
    private String maintenance;
    private boolean avalible;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CarId",referencedColumnName = "imageId")
    private CarImage carImage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ModelId", referencedColumnName = "modelId")
    private CarModel carModel;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<CarShedule> carSheduleList = new ArrayList<>();

    public Car() {
    }

    public Car(String carId, String milege, String maintenance, boolean avalible, CarImage carImage, CarModel carModel) {
        this.carId = carId;
        this.milege = milege;
        this.maintenance = maintenance;
        this.avalible = avalible;
        this.carImage = carImage;
        this.carModel = carModel;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getMilege() {
        return milege;
    }

    public void setMilege(String milege) {
        this.milege = milege;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public boolean isAvalible() {
        return avalible;
    }

    public void setAvalible(boolean avalible) {
        this.avalible = avalible;
    }

    public CarImage getCarImage() {
        return carImage;
    }

    public void setCarImage(CarImage carImage) {
        this.carImage = carImage;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public List<CarShedule> getCarSheduleList() {
        return carSheduleList;
    }

    public void setCarSheduleList(List<CarShedule> carSheduleList) {
        this.carSheduleList = carSheduleList;
    }
}
