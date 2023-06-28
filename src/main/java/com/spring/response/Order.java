package com.spring.response;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Address;
import com.spring.model.Bufcart;

public class Order {
	private int orderId;
	private String orderBy;
	private String orderStatus;
	private List<Bufcart> products = new ArrayList<>();
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Bufcart> getProducts() {
		return products;
	}

	public void setProducts(List<Bufcart> products) {
		this.products = products;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}