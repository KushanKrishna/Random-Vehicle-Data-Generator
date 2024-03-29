package com.kushankrishna.RandomVehicleDataGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	private String building;
	private String street;
	private String city;
	private String state;
	private String country;
	long pin;
	
}
