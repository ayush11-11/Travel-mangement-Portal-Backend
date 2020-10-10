package com.nagarro.ticketmanagement.service;


import java.util.List;

//import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dao.IUserDAO;
import com.nagarro.ticketmanagement.dto.User;


@Service
public class UserServiceImpl implements IUserService{

	
	@Autowired
	private IUserDAO daoRef;
	
	
	@Override
	public void registration(User user) {
		daoRef.save(user);
	}


	@Override
	public void editRegistration(User user, long userId) {
		daoRef.save(user);
	}


	@Override
	public List<User> getAllUser() {
		return daoRef.findAll();
	}
	
    @Override
    public User getUserById(Long userId) {
        //return cusList.stream().filter(e -> e.getCusId() == cusId).findFirst().get();
        return daoRef.getOne(userId);
       
    }
    @Override
	public User getUserByUsername(String eMail) {
		return daoRef.findByeMail(eMail);
	}
	
}
	
	
	
//	 