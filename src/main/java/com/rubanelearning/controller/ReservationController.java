package com.rubanelearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rubanelearning.payload.FlightBookingAcknowledgement;
import com.rubanelearning.payload.FlightBookingRequest;
import com.rubanelearning.service.FlightBookingService;

@RestController
public class ReservationController {

	@Autowired
	private FlightBookingService service;

	@PostMapping("/book-flight-ticket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		System.out.println(request.getPassengerInfo());
		System.out.println(request.getPaymentInfo());
		return service.bookFlightTicket(request);
	}
}
