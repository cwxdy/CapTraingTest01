package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Address;

public interface AddressMapper {

	void addAddress(Address address);
	
	void deleteAddressById(String addressId);
	
	void updateAddress(Address address);
	
	Address getAddressById(String addressId);
	
	List<Address> getAddressList();
	
	void deleteAddressListById(List<String> addressIdList);
}
