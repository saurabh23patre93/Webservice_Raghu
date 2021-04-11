package com.nt.model;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlAttribute(name = "id")
	private Integer empId;
	
	@XmlElement(name = "employee-name")
	private String empName;
	
	@XmlElement(name = "employee-salary")
	private Double empSal;
	
	@XmlTransient
	private String empPwd;
	
	@XmlElementWrapper(name = "projects")
	@XmlElement(name = "project-name")
	private Set<String> empPrjs;
	
	@XmlElementWrapper(name = "project-clients")
	private Map<String,String> clients;
	
	@XmlElement(name = "address")
	private Address addrs;//HAS-A

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public Set<String> getEmpPrjs() {
		return empPrjs;
	}

	public void setEmpPrjs(Set<String> empPrjs) {
		this.empPrjs = empPrjs;
	}

	public Map<String, String> getClients() {
		return clients;
	}

	public void setClients(Map<String, String> clients) {
		this.clients = clients;
	}

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empPwd=" + empPwd
				+ ", empPrjs=" + empPrjs + ", clients=" + clients + ", addrs=" + addrs + "]";
	}
	
	
}
