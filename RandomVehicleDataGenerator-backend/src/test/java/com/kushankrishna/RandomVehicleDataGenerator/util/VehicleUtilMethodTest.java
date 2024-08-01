package com.kushankrishna.RandomVehicleDataGenerator.util;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isAlpha;
import static org.apache.commons.lang3.StringUtils.isAlphanumeric;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test for VehicleUtilMethods")
public class VehicleUtilMethodTest {
    @InjectMocks
    VehicleDataUtilMethods vehicleDataUtilMethods;
    @BeforeEach
    void setUp(){

    }

    @Test
    @SneakyThrows
    @DisplayName("vinGenerator test success scenario")
    void testVinGeneratorSuccessScenario(){
        var response = vehicleDataUtilMethods.vinGenerator();
        assertNotNull(response);
        assertTrue(isAlphanumeric(response));
        assertEquals(17, response.length());
    }
    @Test
    @SneakyThrows
    @DisplayName("regNoGenerator test success scenario")
    void testRegNoGeneratorSuccessScenario(){
        var response = vehicleDataUtilMethods.regNoGenerator();
        assertNotNull(response);
        assertTrue(isAlphanumeric(response));
        assertEquals(12, response.length());
    }
    @Test
    @SneakyThrows
    @DisplayName("engNoGenerator test success scenario")
    void testEngineNumberGeneratorSuccessScenario(){
        var response = vehicleDataUtilMethods.engNoGenerator();
        assertNotNull(response);
        assertTrue(isAlphanumeric(response));
        assertEquals(12, response.length());
    }
    @Test
    @SneakyThrows
    @DisplayName("getFirstName test success scenario")
    void testGetFirstNameSuccessScenario(){
        var response = vehicleDataUtilMethods.getFirstName();
        assertNotNull(response);
        assertTrue(isAlpha(response));
    }
    @Test
    @SneakyThrows
    @DisplayName("getLastName test success scenario")
    void testGetLastNameSuccessScenario(){
        var response = vehicleDataUtilMethods.getLastName();
        assertNotNull(response);
        assertTrue(isAlpha(response));
    }

    @Test
    @SneakyThrows
    @DisplayName("getAddress test success scenario")
    void testGetAddressSuccessScenario(){
        var response = vehicleDataUtilMethods.getAddress();
         assertNotNull(response);
        List<String> cities = Arrays.asList(SyntheticData.cities);
        int i = cities.indexOf(response.getCity());
        Assertions.assertEquals(SyntheticData.states[i].trim(),response.getState());
    }


}
