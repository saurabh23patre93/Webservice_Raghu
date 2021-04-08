package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			String json= "{\"eid\":50203,\"ename\":\"SYED\",\"esal\":20.30, \"prjs\":[\"P1\",\"P2\",\"P3\"],\"vers\":{\"M1\":3.3,\"M2\":4.4},\"adds\":{\"hno\":\"5-A/1\",\"loc\":\"HYD\"}}";
			
			ObjectMapper om=new ObjectMapper();
			Employee emp=om.readValue(json,Employee.class);
			
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
