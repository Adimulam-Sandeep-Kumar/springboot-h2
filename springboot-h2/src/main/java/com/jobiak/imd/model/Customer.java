package com.jobiak.imd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private long acctno;
	private String name;
	private double balance;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public long getAcctno() {
		return acctno;
	}

	public void setAcctno(long acctno) {
		this.acctno = acctno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
