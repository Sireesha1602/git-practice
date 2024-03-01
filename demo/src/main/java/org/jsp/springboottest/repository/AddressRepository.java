package org.jsp.springboottest.repository;

import java.util.List;

import org.jsp.springboottest.dto.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address,Integer>
{
   @Query("select u.addresses from User u where u.id=?1")
   public List<Address> findByUserId(int id);
   
   @Query("select a from Address a where a.country=?1")
   public List<Address> findByCountry(String country);
   
   
}
