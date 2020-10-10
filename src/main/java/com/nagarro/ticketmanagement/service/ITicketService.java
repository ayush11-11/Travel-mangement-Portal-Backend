package com.nagarro.ticketmanagement.service;

import java.util.List;

import com.nagarro.ticketmanagement.dto.TicketRequest;
import com.nagarro.ticketmanagement.dto.User;


public interface ITicketService {


 
    	List<TicketRequest> getUserticket(User user);


		List<TicketRequest> getAllTicket();

		TicketRequest getTicketById(int ticketId);

		void addTicket(TicketRequest ticket);

		void updateTicket(TicketRequest ticket);
}
