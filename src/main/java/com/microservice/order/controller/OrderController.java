package com.microservice.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.order.dto.OrderDTO;
import com.microservice.order.dto.PaymentDTO;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHello(){
		
		return ResponseEntity.ok().body("Hello Spring Cloud GateWay, this is from Order 1 Controller");
	}
	
	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?>sayHelloAgainNur(){
		
		return ResponseEntity.ok().body("Hello Spring Cloud GateWay, this is from Order 1 Controller Again, how are you?");
	}
	
	@RequestMapping(value = "/order-to-payment/{orderId}", method = RequestMethod.GET)
	public ResponseEntity<?>callPaymentFromOrder(@PathVariable(name="orderId") Long orderId){
		PaymentDTO paymentDetails =  restTemplate.getForObject("http://payment-service/payment/get-payment-details/"+(orderId+1000L) , PaymentDTO.class);
//		PaymentDTO paymentDetails =  restTemplate.getForObject("http://localhost:8082/payment/get-payment-details/"+(orderId+1000L) , PaymentDTO.class);
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(orderId);
		orderDTO.setOrderQuantity("5");
		orderDTO.setOrderName("Regular vegitables");
		orderDTO.setOrderStatus(paymentDetails.getPaymentStatus());
		orderDTO.setPaymentDetails(paymentDetails);
		return ResponseEntity.ok().body(orderDTO);
	}
	
	
	

}
