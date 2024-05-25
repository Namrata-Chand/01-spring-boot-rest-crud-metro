package com.example.springboot.cruddemo.rest;

import com.example.springboot.cruddemo.entity.Train1;
import com.example.springboot.cruddemo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class Train1RestController {

    TrainService trainService;

    @Autowired
    public Train1RestController(TrainService thetrainService) {
        trainService = thetrainService;
    }

    @GetMapping("/trains")
    public List<Train1> findALL() {
        return trainService.findAll();
    }

    @GetMapping("/trains/{trainId}")
    public Train1 findById(@PathVariable Integer trainId) {
        return trainService.findById(trainId);
    }

    @DeleteMapping("/trains/{trainId}")
    public void deleteById(@PathVariable Integer trainId) {
        trainService.deleteById(trainId);
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
