package com.nagarro.ticketmanagement.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.ticketmanagement.dto.*;
import com.nagarro.ticketmanagement.service.*;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TicketController {
	
	@Autowired
	ITicketService ticketObj;
	@Autowired
IUserService userObj;
	
	@RequestMapping("/{userId}/tickets")
	public List<TicketRequest> getUserTicket(@PathVariable Long userId){
		User u= userObj.getUserById(userId);
		List<TicketRequest> ticketlist = ticketObj.getUserticket(u);
		return ticketlist;
	}
	
	@RequestMapping("/ticket")
	public List<TicketRequest> getAllTicket(){
		return ticketObj.getAllTicket();
	}
	
	@RequestMapping("/{ticketId}/ticket")
	public TicketRequest getTicketById(@PathVariable int ticketId) {
		
		return ticketObj.getTicketById(ticketId);
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/{userId}/ticket")
	public TicketRequest addTicket(@RequestBody TicketRequest ticket,@PathVariable long userId) {
		
		ticket.setUser(new User(userId,"","","","","","","","","","","","",""));
		 ticketObj.addTicket(ticket);
		 return ticket;
		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/{userId}/ticket/{ticketId}")
	public void updateTicket(@RequestBody TicketRequest ticket,@PathVariable long userId) {
		
		ticket.setUser(new User(userId,"","","","","","","","","","","","",""));
		ticketObj.updateTicket(ticket);
		
	}
	
	
	
	
	
}
