package com.io.test4.model.vo;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	public Book() {
		super();
	}
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDates() {
		return dates;
	}
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	@Override
	public String toString() {
		Date date = new Date(dates.getTimeInMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + format.format(date)
				+ ", discountRate=" + discountRate + "]";
	}
	
}
