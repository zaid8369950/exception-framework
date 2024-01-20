package com.exceptionframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class MyController {
	
	@GetMapping("/error-path")
	public String getData(@PathParam("data") String data) {
		if(data.equals(""))
			throw new MyCustomException("Exception Occured in myController class ! ! !");
		return "Creating Exception Handling Framework ! ! !";	
	}

}
