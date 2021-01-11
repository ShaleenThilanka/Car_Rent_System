package lk.ijse.spring.dto;

import java.util.Date;

public class UserDTO {
    private String userId;
    private String username;
    private String address;
    private String email;
    private String password;
    private Integer contact;
    private Date date;

    public UserDTO() {
    }

    public UserDTO(String userId, String username, String address, String email, String password, Integer contact, Date date) {
        this.userId = userId;
        this.username = username;
        this.address = address;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
