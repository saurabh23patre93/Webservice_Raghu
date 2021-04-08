package nit.nareshit.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nit.nareshit.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			//1.create your class object
			Employee e=new Employee();
			e.setEid(1000);
			e.setEname("Saurabh");
			e.setEsal(45455.0f);
			
			//2.create object to ObjectMapper()
			ObjectMapper om=new ObjectMapper();
			
			//3.call write__method
			String json=om.writeValueAsString(e);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
