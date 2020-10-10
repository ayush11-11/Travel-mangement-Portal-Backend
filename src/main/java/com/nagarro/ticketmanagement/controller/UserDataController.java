package com.nagarro.ticketmanagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.ticketmanagement.dto.User;
import com.nagarro.ticketmanagement.service.IUserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserDataController {
	
	@Autowired
	IUserService userObj;
	
	
	@RequestMapping(method = RequestMethod.POST,value="/registration"
			)
	public User registration(@RequestBody User user) {
		userObj.registration(user);
		return user;
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "registration/{userId}")
	public User editRegistration(@RequestBody User user,@PathVariable long userId) {
		userObj.editRegistration(user, userId);
		return user;
	}
	@RequestMapping(method = RequestMethod.GET, value ="/user/{userId}")
    public User getUserById(@PathVariable long userId) {
        return userObj.getUserById(userId);
    }
	
	
	@RequestMapping("/user")
	public List<User> getAllUser(){
		System.out.println("Get request done");
		return userObj.getAllUser();
	}
	@RequestMapping(method = RequestMethod.GET, value ="/login/{eMail}")
	public User getUserByUsername(@PathVariable String eMail) {
		
		return userObj.getUserByUsername(eMail);
	}
	
	
}
