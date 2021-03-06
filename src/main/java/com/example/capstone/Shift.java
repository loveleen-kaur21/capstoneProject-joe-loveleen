package com.example.capstone;

import javax.persistence.*;

import java.util.*;


@Entity
@Table(name = "shift")

public class Shift {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "userID", nullable = false, unique = false)
    private long userID;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "shift", nullable = false)
    private String shift;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }



}
