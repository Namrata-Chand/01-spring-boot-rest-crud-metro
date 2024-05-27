package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Train1;

import java.util.List;

public interface TrainDAO {

    List<Train1> findAll();

    Train1 findById(Integer trainId);

    void deleteById(Integer trainId);

    Train1 save(Train1 train1);
}
