package com.nt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonProperty("user-id")
	private Integer uid;
	@JsonProperty("user-name")
	private String uname;
	@JsonIgnore
	private String upwd;
	@JsonProperty("user-authority")
	private String urole;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", urole=" + urole + "]";
	}
	
	
}
