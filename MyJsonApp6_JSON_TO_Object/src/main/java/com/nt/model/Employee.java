package com.nt.model;

import java.util.List;
import java.util.Map;

public class Employee {
	private Integer eid;
	private String ename;
	private double esal;
	
	private List<String> prjs;//set.array
	private Map<String,Double> vers;
	private Adress adds;//Has-A
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public List<String> getPrjs() {
		return prjs;
	}
	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}
	public Map<String, Double> getVers() {
		return vers;
	}
	public void setVers(Map<String, Double> vers) {
		this.vers = vers;
	}
	public Adress getAdds() {
		return adds;
	}
	public void setAdds(Adress adds) {
		this.adds = adds;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", prjs=" + prjs + ", vers=" + vers
				+ ", adds=" + adds + "]";
	}
	
	
}
