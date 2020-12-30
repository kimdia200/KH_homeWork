package com.exception.number;

public class NumberRangeException extends RuntimeException{

	public NumberRangeException() {
		super();
	}

	public NumberRangeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NumberRangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NumberRangeException(String message) {
		super(message);
	}

	public NumberRangeException(Throwable cause) {
		super(cause);
	}
	
}
