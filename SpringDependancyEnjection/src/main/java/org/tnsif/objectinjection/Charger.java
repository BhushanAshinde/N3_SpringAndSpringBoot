package org.tnsif.objectinjection;

public class Charger {
	private String brand;
	private int voltage;
	private String type;
	
	//DI using seter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void power() {
		System.out.println("detail realated to charger:");
		System.out.println("Brand:"+brand+""+voltage+""+"Charger-type:"+type);
	}
}
