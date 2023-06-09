package com.neosoft.exceptions;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> customerExceptionHandler(UserException ue, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ue.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> loginExceptionHandler(ProductException pe, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(pe.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}
	@ExceptionHandler(CartException.class)
	public ResponseEntity<MyErrorDetails> loginExceptionHandler(CartException ce, WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> otherExceptionHandler(Exception se, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerExceptionHandler(NoHandlerFoundException error, WebRequest wr) {

		System.out.println("Inside No handler Exceptionsin : Globle exception handling");
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), error.getMessage(), wr.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);
	}

}
