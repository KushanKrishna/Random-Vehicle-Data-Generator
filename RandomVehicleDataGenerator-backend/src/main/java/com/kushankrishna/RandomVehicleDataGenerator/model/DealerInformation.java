package com.kushankrishna.RandomVehicleDataGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealerInformation {
    private String dealerName;
    private Address dealerAddress;
    private String gstNo;

}
