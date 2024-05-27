package com.example.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "train1")
public class Train1 {
    //define fields
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "train_name")
    String trainName;

    @Column(name = "train_code")
    String trainCode;

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    @Column(name = "train_from")
    String trainFrom;

    @Column(name = "train_to")
    String trainTo;

    //define constructors
    public Train1() {
    }

    public Train1(String trainFrom, String trainName, String trainTo) {
        this.trainFrom = trainFrom;
        this.trainName = trainName;
        this.trainTo = trainTo;
    }

    public Train1(String trainCode, String trainFrom, String trainName, String trainTo) {
        this.trainCode = trainCode;
        this.trainFrom = trainFrom;
        this.trainName = trainName;
        this.trainTo = trainTo;
    }

    //define getters & setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        System.out.println("in get id..");
        return id;
    }

    public String getTrainFrom() {
        return trainFrom;
    }

    public void setTrainFrom(String trainFrom) {
        this.trainFrom = trainFrom;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainTo() {
        return trainTo;
    }

    public void setTrainTo(String trainTo) {
        this.trainTo = trainTo;
    }

    //define toString method

    @Override
    public String toString() {
        return "Train1{" +
                "id=" + id +
                ", trainName='" + trainName + '\'' +
                ", trainCode='" + trainCode + '\'' +
                ", trainFrom='" + trainFrom + '\'' +
                ", trainTo='" + trainTo + '\'' +
                '}';
    }
}
