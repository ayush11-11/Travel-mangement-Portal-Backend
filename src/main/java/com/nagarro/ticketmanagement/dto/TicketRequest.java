package com.nagarro.ticketmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class TicketRequest {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	@NotNull
	private String typeRequest;
	@NotNull
	private String priority;
	@NotNull
	private String cityTravelTo;
	@NotNull
	private String cityTravelFrom;
	@NotNull
	private String startDate;
	@NotNull
	private String endtDate;
	@NotNull
	private String passport;
	@NotNull
	private String projectName;
	
	private String travelApproverBy;
	
	private String expectedDuration;
	
	private String upperBond;
	private String expenseBorne;
	
	public String getExpenseBorne() {
		return expenseBorne;
	}

	public void setExpenseBorne(String expenseBorne) {
		this.expenseBorne = expenseBorne;
	}
	@NotNull
	private String additionalDetails;
	
	private String status;
	
	@ManyToOne
	private User user; 
	
	public TicketRequest() {
		
	}
	
	

	
	
	public TicketRequest(int ticketId, @NotNull String typeRequest, @NotNull String priority,
			@NotNull String cityTravelTo, @NotNull String cityTravelFrom, @NotNull String startDate,
			@NotNull String endtDate, @NotNull String passport, @NotNull String projectName, String expenseBorne, String travelApproverBy,
			String expectedDuration, String upperBond, @NotNull String additionalDetails,
			String status,long userId) {
		super();
		this.ticketId = ticketId;
		this.typeRequest = typeRequest;
		this.priority = priority;
		this.cityTravelTo = cityTravelTo;
		this.cityTravelFrom = cityTravelFrom;
		this.startDate = startDate;
		this.endtDate = endtDate;
		this.passport = passport;
		this.projectName = projectName;
		this.expenseBorne=expenseBorne;
		this.travelApproverBy = travelApproverBy;
		this.expectedDuration = expectedDuration;
		this.upperBond = upperBond;
		this.additionalDetails = additionalDetails;
		this.status = status;
		this.user = new User(userId,"","","","","","","","","","","","","");
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getTypeRequest() {
		return typeRequest;
	}
	public void setTypeRequest(String typeRequest) {
		this.typeRequest = typeRequest;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCityTravelTo() {
		return cityTravelTo;
	}
	public void setCityTravelTo(String cityTravelTo) {
		this.cityTravelTo = cityTravelTo;
	}
	public String getCityTravelFrom() {
		return cityTravelFrom;
	}
	public void setCityTravelFrom(String cityTravelFrom) {
		this.cityTravelFrom = cityTravelFrom;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndtDate() {
		return endtDate;
	}
	public void setEndtDate(String endtDate) {
		this.endtDate = endtDate;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTravelApproverBy() {
		return travelApproverBy;
	}
	public void setTravelApproverBy(String travelApproverBy) {
		this.travelApproverBy = travelApproverBy;
	}
	public String getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(String expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
	public String getUpperBond() {
		return upperBond;
	}
	public void setUpperBond(String upperBond) {
		this.upperBond = upperBond;
	}
	public String getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
 
	
}
