package com.example.demo.bean;

public class Address {
	private String addressId;
	private String addressName;
	public Address() {
		super();
	}
	public Address(String addressId, String addressName) {
		super();
		this.addressId = addressId;
		this.addressName = addressName;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + "]";
	}
	
}
