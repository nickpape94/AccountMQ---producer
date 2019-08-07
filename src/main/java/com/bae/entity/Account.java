package com.bae.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private int accountID;

	private String firstName;
	private String lastName;
	private String accountNumber;
	private String prize;

	public Account(String firstName) {
		this.firstName = firstName;
	}

	public Account(int accountID, String firstName, String lastName, String accountNumber, String prize) {
		super();
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.prize = prize;
	}

	public Account(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Account() {
		super();
	}

	public int getAccountID() {
		return accountID;
	}
	// getters and setters

	public void setAccountID(int accountID) {
		this.accountID = accountID;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

}