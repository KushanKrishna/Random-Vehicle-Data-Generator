package com.kushankrishna.RandomVehicleDataGenerator.service;

import com.kushankrishna.RandomVehicleDataGenerator.model.VehicleData;

import java.util.List;

public interface VehicleService {
    List<VehicleData> getGeneratedData(int limit);
}
