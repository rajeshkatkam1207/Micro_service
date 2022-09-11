package com.vedha.reteil.vedhaRetail.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customproduct")
public class Product {
	
	@Id
	private int productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "final_amount")
	private Double finalAmount;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "port_number")
	private String portNumber;

	public Product(int productId, String productName, Double finalAmount, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.finalAmount = finalAmount;
		this.quantity = quantity;
	}

	public Product() {
		super();
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
