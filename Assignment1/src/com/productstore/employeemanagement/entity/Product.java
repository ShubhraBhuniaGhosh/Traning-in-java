package com.productstore.employeemanagement.entity;

public class Product {
	private int productId;
	private String productName; 
	private String description;
	private int price;
	
	public Product(int productId, String productName, int price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public Product(int productId, String productName,String description ,int price) {
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	
	@Override
	public String toString() {
		return this.getProductId()+" "+this.getProductName()+" "+this.getDescription()+" "+this.getPrice();
		
	}
	
	

}
