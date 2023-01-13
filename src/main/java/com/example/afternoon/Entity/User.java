package com.example.afternoon.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @Column
    private Long id;
    private String userName;
    private String userDoB;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDoB() {
        return userDoB;
    }

    public void setUserDoB(String userDoB) {
        this.userDoB = userDoB;
    }
}
