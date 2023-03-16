package org.tnsif.collection;

import java.util.List;
import java.util.Set;

//program to demonstrate on DI using
public class CollectionDemo {
	private List<String>contactNo;
	private Set<String>books;
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display()
	{
		System.out.println("List of ContactNo: ");
		for(String contct: contactNo) 
		{
			System.out.println(contct);
		}
		
		System.out.println("");
		
		System.out.println("Set of books: ");
		for(String b: books) {
			System.out.println(b);
		}
	}	
}
