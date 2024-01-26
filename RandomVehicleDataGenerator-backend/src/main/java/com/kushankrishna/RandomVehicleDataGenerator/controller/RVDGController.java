package com.kushankrishna.RandomVehicleDataGenerator.controller;

import com.kushankrishna.RandomVehicleDataGenerator.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class RVDGController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping("/vehicle/{limit}")
    public ResponseEntity<?> getVehicleData(@PathVariable("limit") int limit) throws InterruptedException {
        if (limit < 0) {
            return ResponseEntity.status(200).body(null);
        }
        System.out.println("Get api called with value: "+limit);    
        return ResponseEntity.status(200).body(this.vehicleService.getGeneratedData(limit));
    }

}
