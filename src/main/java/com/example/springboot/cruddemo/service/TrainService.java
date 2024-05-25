package com.example.springboot.cruddemo.service;

import com.example.springboot.cruddemo.entity.Train1;

import java.util.List;

public interface TrainService {
    public List<Train1> findAll();

    public Train1 findById(Integer trainId);

    public void deleteById(Integer trainId);

    public Train1 save(Train1 train1);
}
