package com.example.afternoon.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Consumer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double spentAmount;

    private Date  spentDate;

    private String foodName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(double spentAmount) {
        this.spentAmount = spentAmount;
    }

    public Date getSpentDate() {
        return spentDate;
    }

    public void setSpentDate(Date spentDate) {
        this.spentDate = spentDate;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", user=" + user +
                ", spentAmount=" + spentAmount +
                ", spentDate=" + spentDate +
                ", foodName='" + foodName + '\'' +
                '}';
    }
}
