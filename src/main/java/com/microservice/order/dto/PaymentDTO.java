package com.microservice.order.dto;

public class PaymentDTO {

	private Long paymentId;
	
	private String paymentAmount;
	private String paymentStatus;
	
	
	
	public PaymentDTO(Long paymentId, String paymentAmount, String paymentStatus) {
		
		this.paymentId = paymentId;
		this.paymentAmount = paymentAmount;
		this.paymentStatus = paymentStatus;
	}
	public PaymentDTO() {
		
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "PaymentDTO [paymentId=" + paymentId + ", paymentAmount=" + paymentAmount + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
	
	
}
