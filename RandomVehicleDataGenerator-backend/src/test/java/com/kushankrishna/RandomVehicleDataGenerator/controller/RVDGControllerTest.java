package com.kushankrishna.RandomVehicleDataGenerator.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kushankrishna.RandomVehicleDataGenerator.service.VehicleService;
import com.kushankrishna.RandomVehicleDataGenerator.serviceImpl.VehicleServiceImpl;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RVDGController.class)
@ExtendWith(MockitoExtension.class)
public class RVDGControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VehicleServiceImpl vehicleService;
    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setup() {
    }


    @Test
    @SneakyThrows
    @DisplayName("Controller test : succeess scenario")
    void whenRequestIsSuccessful() {
        var result = mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/vehicle/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        int responseStatus = result.andReturn().getResponse().getStatus();
        Assertions.assertEquals(OK.value(), responseStatus);
    }

    @Test
    @SneakyThrows
    @DisplayName("Controller test : failure scenario")
    void whenRequestIsNotSuccessful() {
        var result = mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/vehicle/-1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest());
        int responseStatus = result.andReturn().getResponse().getStatus();
        Assertions.assertEquals(BAD_REQUEST.value(), responseStatus);
    }
}
