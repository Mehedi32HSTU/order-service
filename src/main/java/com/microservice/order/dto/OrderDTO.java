package com.microservice.order.dto;

public class OrderDTO {
	private Long orderId;
	private String orderName;
	private String orderQuantity;
	private String orderStatus;
	private PaymentDTO paymentDetails;
	public OrderDTO() {
		
	}
	public OrderDTO(Long orderId, String orderName, String orderQuantity, String orderStatus,
			PaymentDTO paymentDetails) {
		
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
		this.orderStatus = orderStatus;
		this.paymentDetails = paymentDetails;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public PaymentDTO getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDTO paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity
				+ ", orderStatus=" + orderStatus + ", paymentDetails=" + paymentDetails + "]";
	}
	
	
}
