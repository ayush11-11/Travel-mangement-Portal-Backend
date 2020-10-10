package com.nagarro.ticketmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@NotNull(message = "Please enter First Name")
	private String firstName;
	
	@NotNull(message = "Please enter Last Name")
	private String lastName;
	
	@NotNull(message = "Please enter businessUnit")
	private String businessUnit;
	
	@NotNull(message = "Please enter Title")
	private String title;
	
	@NotNull(message = "Please enter Email")
	@javax.validation.constraints.Email
	private String eMail;
	
	@NotNull(message = "Please enter Phone")
	private String phone;
	
	@NotNull(message = "Please enter Address One")
	private String addressOne;
	
	@NotNull
	private String password;

	public User(long userId, @NotNull(message = "Please enter First Name") String firstName,
			@NotNull(message = "Please enter Last Name") String lastName,
			@NotNull(message = "Please enter businessUnit") String businessUnit,
			@NotNull(message = "Please enter Title") String title,
			@NotNull(message = "Please enter Email") @Email String eMail,
			@NotNull(message = "Please enter Phone") String phone,
			@NotNull(message = "Please enter Address One") String addressOne, @NotNull String password,
			String addressTwo, @NotNull(message = "Please enter City") String city,
			@NotNull(message = "Please enter State") String state, @NotNull(message = "Please enter Zip") String zip,
			@NotNull(message = "Please enter Country Name") String country) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.businessUnit = businessUnit;
		this.title = title;
		this.eMail = eMail;
		this.phone = phone;
		this.addressOne = addressOne;
		this.password = password;
		this.addressTwo = addressTwo;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	private String addressTwo;
	
	@NotNull(message = "Please enter City")
	private String city;
	
	@NotNull(message = "Please enter State")
	private String state;

	@NotNull(message = "Please enter Zip")
	private String zip;

	@NotNull(message = "Please enter Country Name")
	private String country;

	public User() {
		
	}
	


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
	
	

