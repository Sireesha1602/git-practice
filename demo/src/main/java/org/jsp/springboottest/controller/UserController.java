package org.jsp.springboottest.controller;

import org.jsp.springboottest.dto.ResponseStructure;
import org.jsp.springboottest.dto.User;
import org.jsp.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController 
{
  @Autowired
  private UserService service;
  @PostMapping
  public ResponseStructure<User> saveUser(@RequestBody User u)
  {
	  return service.saveUser(u);
  }
}
