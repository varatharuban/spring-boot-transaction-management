package com.rubanelearning.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rubanelearning.entity.Passenger;
import com.rubanelearning.entity.Payment;
import com.rubanelearning.payload.FlightBookingAcknowledgement;
import com.rubanelearning.payload.FlightBookingRequest;
import com.rubanelearning.repository.PassengerRepository;
import com.rubanelearning.repository.PaymentRepository;
import com.rubanelearning.service.FlightBookingService;
import com.rubanelearning.util.PaymentUtils;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private PassengerRepository passengerInfoRepository;

	@Autowired
	private PaymentRepository paymentInfoRepository;

	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

		Passenger passenger = request.getPassengerInfo();
		Payment payment = request.getPaymentInfo();

		passenger = passengerInfoRepository.save(passenger);

		PaymentUtils.validateCreditLimit(payment.getAccountNo(), passenger.getFare());

		payment.setPassengerId(passenger.getPId());
		payment.setAmount(passenger.getFare());
		paymentInfoRepository.save(payment);

		return new FlightBookingAcknowledgement("SUCCESS", passenger.getFare(),
				UUID.randomUUID().toString().split("-")[0], passenger);

	}
}