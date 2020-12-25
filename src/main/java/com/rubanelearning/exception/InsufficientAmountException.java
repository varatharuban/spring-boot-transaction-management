package com.rubanelearning.exception;

public class InsufficientAmountException extends RuntimeException {
	
	private static final long serialVersionUID = -8942185703826597127L;

	public InsufficientAmountException(String msg) {
		super(msg);
	}
}