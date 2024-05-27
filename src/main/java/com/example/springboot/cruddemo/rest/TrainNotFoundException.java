package com.example.springboot.cruddemo.rest;

public class TrainNotFoundException extends RuntimeException {
    public TrainNotFoundException() {

    }

    public TrainNotFoundException(String message) {
        super(message);
    }

}
