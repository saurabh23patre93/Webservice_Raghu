package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Employee;

public class Test {
	public static void main(String[] args) {
		try {
			String json="{\"eid\":10,\"ename\":\"A\",\"esal\":200.0}";
			
			ObjectMapper om=new ObjectMapper();
			
			Employee emp=om.readValue(json, Employee.class);
			
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
