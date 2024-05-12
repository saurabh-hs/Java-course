package com.system;

public class Member {
	protected int memberID;
	protected String memberName;
	protected String email;
	protected long phone;
	protected String borrowedBooks;
	
	public Member() {
		this.memberID = 0;
		this.memberName = "None";
		this.email = "None";
		this.phone = 0;
		this.borrowedBooks = "None";
	}
	
	public Member(int memberID, String memberName, String email, long phone, String borrowedBooks) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
		this.borrowedBooks = borrowedBooks;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getmemberName() {
		return memberName;
	}

	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(String borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	public void addMember(int memberID, String memberName, String email, long phone, String borrowedBooks) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
		this.borrowedBooks = borrowedBooks;
		System.out.println("Member added successfully!!");
	}
	
	public String getMemberDetails(int memberID) {
		if(this.memberID == memberID)
			return "Member Details: "+"[Member ID: "+this.memberID+" Name: "+this.memberName+" Email: "+this.email+" Borrowed Book Name: "+this.borrowedBooks+"]";
		else
			return "Member is not available!!";
	}
	
	public String getBorrowedBookDetails(int memberID) {
		if(this.memberID == memberID) 
			return this.borrowedBooks;
		else
			return "User not borrowed any book";
	}
}
