package lk.ijse.spring.dto;

public class CarImageDTO {
    private String imageId;
    private byte frontImage;
    private byte backImage;
    private byte sideImage;
    private byte interiorImage;

    public CarImageDTO() {
    }

    public CarImageDTO(String imageId, byte frontImage, byte backImage, byte sideImage, byte interiorImage) {
        this.imageId = imageId;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.sideImage = sideImage;
        this.interiorImage = interiorImage;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public byte getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(byte frontImage) {
        this.frontImage = frontImage;
    }

    public byte getBackImage() {
        return backImage;
    }

    public void setBackImage(byte backImage) {
        this.backImage = backImage;
    }

    public byte getSideImage() {
        return sideImage;
    }

    public void setSideImage(byte sideImage) {
        this.sideImage = sideImage;
    }

    public byte getInteriorImage() {
        return interiorImage;
    }

    public void setInteriorImage(byte interiorImage) {
        this.interiorImage = interiorImage;
    }
}
