package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class CustomerDTO {
    private String customerId;
    private String customerName;
    private String nicPic1;
    private String nicPic2;
    private String licensePic1;
    private String licensePic2;
    private java.sql.Timestamp date;
    private String userId;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String nicPic1, String nicPic2, String licensePic1, String licensePic2, Timestamp date, String userId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.nicPic1 = nicPic1;
        this.nicPic2 = nicPic2;
        this.licensePic1 = licensePic1;
        this.licensePic2 = licensePic2;
        this.date = date;
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNicPic1() {
        return nicPic1;
    }

    public void setNicPic1(String nicPic1) {
        this.nicPic1 = nicPic1;
    }

    public String getNicPic2() {
        return nicPic2;
    }

    public void setNicPic2(String nicPic2) {
        this.nicPic2 = nicPic2;
    }

    public String getLicensePic1() {
        return licensePic1;
    }

    public void setLicensePic1(String licensePic1) {
        this.licensePic1 = licensePic1;
    }

    public String getLicensePic2() {
        return licensePic2;
    }

    public void setLicensePic2(String licensePic2) {
        this.licensePic2 = licensePic2;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
