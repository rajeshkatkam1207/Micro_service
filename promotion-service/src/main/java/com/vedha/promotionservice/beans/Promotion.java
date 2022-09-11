package com.vedha.promotionservice.beans;

public class Promotion {

	private int productId;
	private String productName;
	private Double finalAmount;
	private int quantity;
	private String portNumber;
	
	public Promotion() {
		
	}
	public Promotion(int productId, String productName, Double finalAmount, int quantity, String portNumber) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.finalAmount = finalAmount;
		this.quantity = quantity;
		this.portNumber = portNumber;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	
	
}
