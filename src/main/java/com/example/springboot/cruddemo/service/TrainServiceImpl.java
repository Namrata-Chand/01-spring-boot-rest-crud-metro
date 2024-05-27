package com.example.springboot.cruddemo.service;

import com.example.springboot.cruddemo.dao.TrainDAO;
import com.example.springboot.cruddemo.entity.Train1;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    TrainDAO trainDAO;

    @Autowired
    public TrainServiceImpl(TrainDAO theTrainDAO) {
        trainDAO = theTrainDAO;
    }

    @Override
    public List<Train1> findAll() {
        return trainDAO.findAll();
    }

    @Override
    public Train1 findById(Integer trainId) {
        return trainDAO.findById(trainId);
    }

    @Transactional
    @Override
    public void deleteById(Integer trainId) {
        trainDAO.deleteById(trainId);
    }

    @Override
    @Transactional
    public Train1 save(Train1 train1) {
        return trainDAO.save(train1);
    }

    @Override
    public List<Train1> findByCode(String trainCode) {
        return trainDAO.findByCode(trainCode);
    }
}
