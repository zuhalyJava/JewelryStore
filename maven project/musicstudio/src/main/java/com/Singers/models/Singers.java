package com.Singers.models;

public class Singers {
	
	// create table Singers(
	
	// id int primery key
	// first name varchar (20)
	// last name varchar (20)
	// phone number int (10) unique not null,
	// email varchar (50)
	//);
	
	
	private int id;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;
	
	public Singers() {
	

		}
	
	public Singers(int id, String firstName, String lastName, int phoneNumber, String email) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.email=email;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Singers [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + "]";
	}
	
	
	
	}
