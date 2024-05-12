package com.app;

import java.util.Scanner;

import com.system.Book;
import com.system.Librarian;
import com.system.Library;
import com.system.Member;

/*
Classes
1. Library
Attributes: name, address
Methods: getSpecificLibrary
2. Book
Attributes: ISBN, title, author, publisher, year
Methods: addBook, getBooksByAuthor, getPublisherBookList
3. Member
Attributes: memberID, name, email, phone, borrowedBooks
Methods: addMember, getMemberDetails, getBorrowedBookDetails
4. Librarian
Attributes: employeeID, name, email, phone
Methods: getLibrarianDetails, getLibrarianEmail
5. Transaction
Attributes: transactionID, book, member, issueDate, returnDate
Methods: getTransactionDetails, completeTransaction


Add sample Data for all classes
*/


public class LibraryManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter library name & Address: ");
		Library lb = new Library(scanner.nextLine(), scanner.nextLine());
		
		System.out.println("Please enter Library name: ");
		System.out.println(lb.getSpecificLibrary(scanner.next()));
		
		Book b = new Book();
		System.out.println("Please enter book details: 1.ISBN no. 2.Tiltle 3.Author 4.Publisher 5.year ");
		b.addBooks(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
		
		System.out.println("Please enter author name: ");
		System.out.println(b.getBooksByAuthor(scanner.next()));
		
		System.out.println("Please enter publisher name: ");
		System.out.println(b.getPublisherBookList(scanner.next()));
		
		Member m = new Member();
		System.out.println("Please enter members details: 1.MemberID 2.Name 3.EmailID 4.Phone 5.Borrowed books");
		m.addMember(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextLong(), scanner.next());
		
		System.out.println("Please enter member ID: ");
		System.out.println(m.getMemberDetails(scanner.nextInt()));
		
		System.out.println("Please enter member ID: ");
		System.out.println(m.getBorrowedBookDetails(scanner.nextInt()));
		
		//String name, String email, int phone
		System.out.println("Please enter librarian details: 1.EmployeeID 2.Name 3.Email ID 4.Phone number");
		Librarian lba = new Librarian(scanner.nextInt(),scanner.next(), scanner.next(), scanner.nextInt());
		
		System.out.println("Please enter employee ID: ");
		System.out.println(lba.getLibrarianDetails(scanner.nextInt()));
		
		System.out.println("Please enter employee ID: ");
		System.out.println(lba.getLibrarianEmail(scanner.nextInt()));
		
		
		
		scanner.close();
	}

}
