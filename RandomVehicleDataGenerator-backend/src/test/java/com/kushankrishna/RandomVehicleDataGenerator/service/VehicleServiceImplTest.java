package com.kushankrishna.RandomVehicleDataGenerator.service;

import com.kushankrishna.RandomVehicleDataGenerator.serviceImpl.VehicleServiceImpl;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test for VehicleServiceImpl")
public class VehicleServiceImplTest {

    @InjectMocks
    VehicleServiceImpl vehicleService;
    @BeforeEach
    void setUp(){

    }

    @ParameterizedTest
    @SneakyThrows
    @DisplayName("ServiceImpl parameterized test success scenario")
    @ValueSource(ints = {10,20,30,40})
    void testServiceImplSuccessScenario(int limit){
        var response = vehicleService.getGeneratedData(limit);
        Assertions.assertNotNull(response);
    }
}
