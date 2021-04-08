package com.nt.model;

import java.util.List;
import java.util.Set;

public class Student {
	private Integer sid;
	private String sname;
	private double sfee;
	private ExamData examData;
	
	private Set<String> subj;
	private List<String> marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public ExamData getExamData() {
		return examData;
	}
	public void setExamData(ExamData examData) {
		this.examData = examData;
	}
	public Set<String> getSubj() {
		return subj;
	}
	public void setSubj(Set<String> subj) {
		this.subj = subj;
	}
	public List<String> getMarks() {
		return marks;
	}
	public void setMarks(List<String> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", examData=" + examData + ", subj="
				+ subj + ", marks=" + marks + "]";
	}
	
	
}
