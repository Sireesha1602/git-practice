package org.jsp.springboottest.dao;

import java.util.Optional;

import org.jsp.springboottest.dto.User;
import org.jsp.springboottest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	@Autowired
	 private UserRepository repo;
   public User saveUser(User u)
   {
	return repo.save(u);
	   
   }
   
   public User updateUser(User u)
   {
	   return repo.save(u);
   }
   
   public Optional<User> findById(int id)
   {
	   return repo.findById(id);
   }
   
   public User verifyByPhone(long phone,String password)
   {
	   return repo.findByPhone(phone, password);
   }
   
   public User verifyByEmail(String email,String password)
   {
	   return repo.findByEmail(email, password);
   }
}
