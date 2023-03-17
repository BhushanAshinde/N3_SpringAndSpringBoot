package org.tnsif.autowireexample;

public class Human {
	Oxygen o;

	/*public void setO(Oxygen o) {
		this.o = o;
	}
	*/
	//
	public void accept() 
	{
		o.Human();
	}

	public Human(Oxygen o) {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Autowiring Using constructor");
		this.o=o;
	}

}
