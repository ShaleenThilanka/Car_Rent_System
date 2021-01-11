package lk.ijse.spring.dto;

import java.sql.Timestamp;

public class DriverDTO {
    private String driverId;
    private String firstName;
    private String lastName;
    private String nic;
    private String email;
    private Integer contact;
    private String address;
    private String licensePic1;
    private String licensePic2;
    private boolean avalibleStatus;
    private String username;
    private String password;
    private java.sql.Timestamp registerDate;

    public DriverDTO() {
    }

    public DriverDTO(String driverId, String firstName, String lastName, String nic, String email, Integer contact, String address, String licensePic1, String licensePic2, boolean avalibleStatus, String username, String password, Timestamp registerDate) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.licensePic1 = licensePic1;
        this.licensePic2 = licensePic2;
        this.avalibleStatus = avalibleStatus;
        this.username = username;
        this.password = password;
        this.registerDate = registerDate;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public boolean isAvalibleStatus() {
        return avalibleStatus;
    }

    public void setAvalibleStatus(boolean avalibleStatus) {
        this.avalibleStatus = avalibleStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }
}
