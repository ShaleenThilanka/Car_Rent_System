package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private String adminId;
    private String adminName;
    private String adminAddress;
    private Integer contact;
    private String nicNumber;
    private String userName;
    private String password;

    public Admin() {
    }

    public Admin(String adminId, String adminName, String adminAddress, Integer contact, String nicNumber, String userName, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminAddress = adminAddress;
        this.contact = contact;
        this.nicNumber = nicNumber;
        this.userName = userName;
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
