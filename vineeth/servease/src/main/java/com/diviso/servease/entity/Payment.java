 package com.diviso.servease.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id=1;
	private String recepts;
	private String payment;
	private double total;
	private String transid;
	private String notes;
		
	@Lob
	private byte[] returnmsg;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(byte[] returnmsg) {
		this.returnmsg = returnmsg;
	}

	public String getRecepts() {
		return recepts;
	}

	public void setRecepts(String recepts) {
		this.recepts = recepts;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTransid() {
		return transid;
	}

	public void setTransid(String transid) {
		this.transid = transid;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
