package com.webo.projectexceptionhandle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.webo.exception.EmployeeNotFoundException;
import com.webo.exceptionresponse.ExceptionResponse;

@RestControllerAdvice
public class HandelException {
	
 @ExceptionHandler(EmployeeNotFoundException.class)
	public ExceptionResponse exception(EmployeeNotFoundException em,HttpServletRequest req) {
	ExceptionResponse res=new ExceptionResponse();
	res.setMsg("employee not found");
	res.setRequestUri(req.getRequestURI());
	res.setNumericStatusCode(HttpServletResponse.SC_NOT_FOUND);
	res.setStringStatusCode(HttpStatus.NOT_FOUND);
	return res;
}
	
 
}
