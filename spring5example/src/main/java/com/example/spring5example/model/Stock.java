package com.example.spring5example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Stock {
	
	private String stockCode;
	private String price;
	private String dateTime() {
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	         LocalDateTime dateTime = LocalDateTime.now();

	         String formattedDateTime = dateTime.format(formatter); // "1986-04-08 12:30"

	         return formattedDateTime;
	}
	
	
	
	public Stock(String stockCode, String price) {
		super();
		this.stockCode = stockCode;
		this.price = price;
		
	}



	@Override
	public String toString() {
		return "Stock [stockCode=" + stockCode + ", price=" + price + "]";
	}



	public String getStockCode() {
		return stockCode;
	}



	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
