package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {

	private int pId; // 제품번호
	private String pName; // 현재 추가된 객체 수
	private int price; // 제품 가격
	private double tax; // 제품 세금
	
	public Product() {
		ProductController.count = 0;
	}

	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		ProductController.count = 0;
	}
	
	
	
	
	public int getPId() {
		return pId;
	}

	public void setPld(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		return "제품번호 : " + pId + "\n제품명 : " + pName + "\n제품가격 : " + price + "\n제품세금 : " + tax;
				
	}
	
}
