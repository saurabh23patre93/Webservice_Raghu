package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.User;

public class Test {
	public static void main(String[] args) {
		try {
			User user=new User();
			user.setUid(100);
			user.setUname("Sample");
			user.setUpwd("ABC123");
			user.setUrole("ADMIN");
			
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(user);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
