package com.nagarro.ticketmanagement.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.ticketmanagement.dao.ITickerDAO;
import com.nagarro.ticketmanagement.dto.TicketRequest;
import com.nagarro.ticketmanagement.dto.User;


@Service
public class TicketServiceImpl implements ITicketService{

	
	@Autowired
	private ITickerDAO ticketDaoRef;

 
	@Override
    public List<TicketRequest> getUserticket(User user) {
        // TODO Auto-generated method stub
        return ticketDaoRef.findByUser(user);
    }

	@Override
	public List<TicketRequest> getAllTicket() {
		
		return ticketDaoRef.findAll();
	}

	@Override
	public TicketRequest getTicketById(int ticketId) {
		
		return ticketDaoRef.getOne(ticketId);
	}

	@Override
	public void addTicket(TicketRequest ticket) {
		
		ticketDaoRef.save(ticket);
	}

	@Override
	public void updateTicket(TicketRequest ticket) {
		ticketDaoRef.save(ticket);
		
	}


	
}
