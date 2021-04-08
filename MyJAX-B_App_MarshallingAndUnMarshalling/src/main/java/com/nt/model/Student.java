package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

//JAXB class
@XmlRootElement
public class Student {
	private Integer stdid;
	private String stdName;
	private Double stdFee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getStdid() {
		return stdid;
	}
	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	
}
