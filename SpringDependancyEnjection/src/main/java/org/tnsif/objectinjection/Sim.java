package org.tnsif.objectinjection;

public class Sim {
	private String simtype;
	private String company;
	
	//setter
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Sim [simtype=" + simtype + ", company=" + company + "]";
	}
	

}
