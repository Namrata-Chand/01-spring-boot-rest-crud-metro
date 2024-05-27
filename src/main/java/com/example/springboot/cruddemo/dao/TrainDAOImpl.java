package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Train1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainDAOImpl implements TrainDAO {

    EntityManager entityManager;

    @Autowired
    public TrainDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Train1> findAll() {
        TypedQuery<Train1> theQuery = entityManager.createQuery("from Train1", Train1.class);

        List<Train1> trains = theQuery.getResultList();

        return trains;
    }

    @Override
    public Train1 findById(Integer trainId) {
        return entityManager.find(Train1.class, trainId);
    }

    @Override
    public void deleteById(Integer trainId) {
        Train1 train1 = entityManager.find(Train1.class, trainId);
        entityManager.remove(train1);
    }

    @Override
    public Train1 save(Train1 train1) {

        return entityManager.merge(train1);
    }


}
