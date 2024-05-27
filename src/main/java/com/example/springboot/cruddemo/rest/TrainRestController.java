package com.example.springboot.cruddemo.rest;

import com.example.springboot.cruddemo.entity.Train1;
import com.example.springboot.cruddemo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class TrainRestController {

    TrainService trainService;

    @Autowired
    public TrainRestController(TrainService thetrainService) {
        trainService = thetrainService;
    }

    @GetMapping("/trains")
    public List<Train1> findALL() {

        List trainArray = new ArrayList<>(trainService.findAll());
        if (trainArray.isEmpty()) {
            throw new TrainNotFoundException("No trains found.");
        } else {
            return trainArray;
        }
    }

    @GetMapping("/trains/{trainId}")
    public Train1 findById(@PathVariable Integer trainId) {
        if (trainId <= 0) {
            throw new TrainNotFoundException("Train Id should be greater than 0.");
        }

        Train1 theTrain1 = trainService.findById(trainId);

        if (theTrain1 == null) {
            throw new TrainNotFoundException("The train with id " + trainId + " is not found.");
        }

        return theTrain1;
    }

    @DeleteMapping("/trains/{trainId}")
    public void deleteById(@PathVariable Integer trainId) {
        //trainService.deleteById(trainId);

        if (trainId <= 0) {
            throw new TrainNotFoundException("Train Id should be greater than 0.");
        }

        Train1 theTrain1 = trainService.findById(trainId);

        if (theTrain1 == null) {
            throw new TrainNotFoundException("The train with id " + trainId + " is not found.");
        } else {
            trainService.deleteById(trainId);
        }
    }

    @PutMapping("/trains")
    public Train1 updateTrain(@RequestBody Train1 theTrain) {
        return trainService.save(theTrain);
    }

    @PostMapping("/trains")
    public Train1 addTrain(@RequestBody Train1 theTrain) {
        theTrain.setId(0);
        //System.out.println("Saving a new record...");
        return trainService.save(theTrain);
    }
}
