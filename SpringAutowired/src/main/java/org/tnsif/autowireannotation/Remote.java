package org.tnsif.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	private Cell Cell;
	
	
	@Autowired
	@Qualifier("c2")
	//DI Using setter
	public void setCell(Cell cell) {
		this.Cell = cell;
	}
	
	//Default constructor
	public Remote() {
		System.out.println("Default constructor for remote");
	}
	
	public void remote() {
		Cell.power();
	}

}
