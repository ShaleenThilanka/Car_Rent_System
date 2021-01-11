package lk.ijse.spring.dto;

public class CarDTO {
    private String carId;
    private String mileage;
    private String maintainkm;
    private boolean availble;
    private String imageId;
    private String modelId;

    public CarDTO() {
    }

    public CarDTO(String carId, String mileage, String maintainkm, boolean availble, String imageId, String modelId) {
        this.carId = carId;
        this.mileage = mileage;
        this.maintainkm = maintainkm;
        this.availble = availble;
        this.imageId = imageId;
        this.modelId = modelId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getMaintainkm() {
        return maintainkm;
    }

    public void setMaintainkm(String maintainkm) {
        this.maintainkm = maintainkm;
    }

    public boolean isAvailble() {
        return availble;
    }

    public void setAvailble(boolean availble) {
        this.availble = availble;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
}
