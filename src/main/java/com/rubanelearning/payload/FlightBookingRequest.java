package com.rubanelearning.payload;

import com.rubanelearning.entity.Passenger;
import com.rubanelearning.entity.Payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private Passenger passengerInfo;

	private Payment paymentInfo;
}