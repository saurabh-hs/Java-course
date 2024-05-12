package com.system;

import java.time.LocalDate;

public class Transaction {
	protected int transactionID;
	protected String book;
	protected String member;
	protected LocalDate issueDate;
	protected LocalDate returnDate;
	
	public Transaction() {
		this.transactionID = 0;
		this.book = "None";
		this.member = "None";		
	}
	
	public Transaction(int transactionID, String book, String member, LocalDate issueDate, LocalDate returnDate) {
		this.transactionID = transactionID;
		this.book = book;
		this.member = member;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public String getTransactionDetails(int transactionID) {
		if(this.transactionID == transactionID)
			return "Transaction Details: [Transaction ID: "+this.transactionID+" Member Name: "+this.member+" Book Name: "+this.book+
					" Issue date: "+this.issueDate+" Return date: "+this.returnDate+"]";
		else
			return "Transaction not done";
	}
	
	public void completeTransaction(LocalDate returnDate) {
		this.returnDate = returnDate;
		System.out.println("Transaction is completed!!");
	}

}
