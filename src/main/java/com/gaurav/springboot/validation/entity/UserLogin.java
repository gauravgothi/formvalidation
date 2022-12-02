package com.gaurav.springboot.validation.entity;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class UserLogin {
    public UserLogin() {
    }

    @NotBlank(message = "username can't be blank")
    @Size(min = 8,max = 15,message = "must be in 8 to 15 charcter")
    private String userName;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
