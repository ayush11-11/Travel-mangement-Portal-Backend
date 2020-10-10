package com.nagarro.ticketmanagement.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.ticketmanagement.dto.*;



@Repository
public interface ITickerDAO extends JpaRepository<TicketRequest, Integer>{

 
	
    List<TicketRequest> findByUser(User user);//object


}
