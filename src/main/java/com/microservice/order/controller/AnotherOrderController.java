package com.microservice.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order2")
public class AnotherOrderController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHello(){
		
		return ResponseEntity.ok().body("Hello Spring Cloud GateWay, this is from Order 2 Controller");
	}
	
	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloAgainNur(){
		
		return ResponseEntity.ok().body("Hello Spring Cloud GateWay, this is from Order 2 Controller Again, how are you?");
	}
}
