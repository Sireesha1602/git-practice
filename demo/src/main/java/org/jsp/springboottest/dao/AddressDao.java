package org.jsp.springboottest.dao;

import java.util.List;

import org.jsp.springboottest.dto.Address;
import org.jsp.springboottest.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao 
{
	@Autowired
	private AddressRepository repo;
	
	public Address saveAddress(Address a)
	{
		return repo.save(a);
	}
    
	public Address updateAddress(Address a)
	{
		return repo.save(a);
	}
	public List<Address> findByUserId(int id)
	{
		return repo.findByUserId(id);
	}
	public List<Address> findByCountry(String country)
	{
		return repo.findByCountry(country);
	}
}
