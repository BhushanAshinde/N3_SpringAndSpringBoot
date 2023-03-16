package org.tnsif.objectinjection;

//Program to demonstrate the dependacy in the form of object
public class Cellphone {
	
	//DI in the form of object
	Charger Charger;
	
	//DI using setter
	public void setCharger(Charger charger) {
		Charger = charger;
	}
	
	//injection the object of charger class
	public void accept()
	{
		Charger.power();
	}

	
	

}
