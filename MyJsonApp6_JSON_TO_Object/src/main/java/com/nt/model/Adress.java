package com.nt.model;

public class Adress {
	private String hno;
	private String loc;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Adress [hno=" + hno + ", loc=" + loc + "]";
	}
	
	
}
