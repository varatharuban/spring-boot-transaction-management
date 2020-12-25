package com.rubanelearning.payload;

import com.rubanelearning.entity.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

    private String status;
    
    private double totalFare;
    
    private String pnrNo;
    
    private Passenger passengerInfo;
}