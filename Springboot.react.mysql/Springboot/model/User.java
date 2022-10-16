package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
   // 1.Register(name,email,mobile,address,password) from react to spring
   // if email is exist throw the error.(should not register)
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
           Integer id ;
    String name;
    String email;
    int mobile;
    String address;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

