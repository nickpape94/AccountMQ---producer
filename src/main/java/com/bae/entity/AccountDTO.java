package com.bae.entity;

public class AccountDTO {

	private int accountID;
	private String firstName;
	private String lastName;
	private String accountNumber;
	private String prize;

	public AccountDTO(Account account) {
		this.accountID = account.getAccountID();
		this.firstName = account.getFirstName();
		this.lastName = account.getLastName();
		this.accountNumber = account.getAccountNumber();
		this.prize = account.getPrize();
	}

	public int getAccountID() {
		return accountID;
	}

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