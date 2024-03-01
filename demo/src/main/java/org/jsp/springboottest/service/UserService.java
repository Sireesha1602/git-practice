package org.jsp.springboottest.service;


import java.util.Optional;

import org.jsp.springboottest.dao.UserDao;
import org.jsp.springboottest.dto.ResponseStructure;
import org.jsp.springboottest.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
  private static final int ResponseStructure = 0;
@Autowired
  private UserDao dao;
  
  public ResponseStructure<User> saveUser(User u)
  {
	  ResponseStructure<User> s=new ResponseStructure<>();
	  s.setMessage("user saved");
	  s.setData(dao.saveUser(u));
	  s.setStatusCode(HttpStatus.CREATED.value());
	  return s;
  }
  
  public ResponseEntity<ResponseStructure<User>> updateUser(User u)
  {
	 // ResponseEntity<ResponseStructure<User>> e=new  ResponseEntity<ResponseStructure<User>>();
	  Optional<User> recUser=dao.findById(u.getId());
	  ResponseStructure<User> s=new ResponseStructure<>();
	  if(recUser.isPresent())
	  {
		  User dbu=recUser.get();
		  dbu.setName(u.getName());
		  dbu.setPhone(u.getPhone());
		  dbu.setAge(u.getAge());
		  dbu.setEmail(u.getEmail());
		  dbu.setGender(u.getGender());
		  dbu.setPassword(u.getPassword());
		  
		  s.setMessage("user updated");
		  s.setData(dao.updateUser(u));
		  s.setStatusCode(HttpStatus.ACCEPTED.value());
		 // return ResponseEntity<ResponseStructure<User>>(s,HttpStatus.ACCEPTED);
	  }
	  s.setMessage("cant update user");
	  
	  s.setStatusCode(HttpStatus.NOT_FOUND.value());
	// return ResponseEntity<ResponseStructure<User>>(s,HttpStatus.NOT_FOUND);
	return null;
  }
  
//  public ResponseEntity<ResponseStructure<User>> findById(int id)
  {
	 // ResponseEntity<ResponseStructure<User>> s=new ResponseEntity<ResponseStructure<>>();
	 // Optional<User> u=dao.findById(id);
	 // if(u.isPresent())
	  {
		//  s.setMessage("user found");
		 // s.setData(dao.findById(id));
		 // s.setStatusCode(HttpStatus.OK.value());
		//  return s;
	  }
  }
}
