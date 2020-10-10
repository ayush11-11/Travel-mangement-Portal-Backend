package com.nagarro.ticketmanagement.service;

import java.util.List;

//import java.util.List;


import com.nagarro.ticketmanagement.dto.User;

public interface IUserService {


		void registration(User user);  //                     /registration
		void editRegistration(User user,long userId);  //     /registration/id
	    User getUserById(Long userId);
	    User getUserByUsername(String eMail);
		List<User> getAllUser();   //                         /user
}
