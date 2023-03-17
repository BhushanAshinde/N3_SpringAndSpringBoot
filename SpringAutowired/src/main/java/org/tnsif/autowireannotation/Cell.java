package org.tnsif.autowireannotation;

public class Cell {
	private String company;
	private String size;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//default constructor
	public Cell() {
		super();
		System.out.println("Default constructor for cell");
	}
	
	public void power() {
		System.out.println("Size of a cell: "+company);
		System.out.println("Size of Cell: "+size);
	}
	
	

}
