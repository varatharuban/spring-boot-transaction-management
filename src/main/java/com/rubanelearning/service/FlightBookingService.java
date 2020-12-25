package com.rubanelearning.service;

import com.rubanelearning.payload.FlightBookingAcknowledgement;
import com.rubanelearning.payload.FlightBookingRequest;

public interface FlightBookingService {

	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request);
}