package com.example.springboot.cruddemo.service;

import com.example.springboot.cruddemo.dao.Train1DAO;
import com.example.springboot.cruddemo.entity.Train1;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    Train1DAO train1DAO;

    @Autowired
    public TrainServiceImpl(Train1DAO theTrain1DAO) {
        train1DAO = theTrain1DAO;
    }

    @Override
    public List<Train1> findAll() {
        return train1DAO.findAll();
    }

    @Override
    public Train1 findById(Integer trainId) {
        return train1DAO.findById(trainId);
    }

    @Transactional
    @Override
    public void deleteById(Integer trainId) {
        train1DAO.deleteById(trainId);
    }

    @Override
    @Transactional
    public Train1 save(Train1 train1) {
        return train1DAO.save(train1);
    }
}
