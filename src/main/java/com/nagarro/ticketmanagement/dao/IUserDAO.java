package com.nagarro.ticketmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.ticketmanagement.dto.User;

@Repository
public interface IUserDAO extends JpaRepository<User, Long>{
	User findByeMail(String username);

}
