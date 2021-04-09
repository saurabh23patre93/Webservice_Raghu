package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.nt.model.Employee;

public class Object_TO_XML_Test {

	public static void main(String[] args){
		try {
			Employee emp=new Employee();
			emp.setEmpId(10);
			emp.setEmpName("SAMPLE");
			emp.setEmpSal(200.0);
			emp.setEmpPwd("ABCD");
			
			JAXBContext context=JAXBContext.newInstance(Employee.class);
			
			Marshaller m=context.createMarshaller();
			
			m.marshal(emp,new File("E:/emps.xml"));
			System.out.println("DONE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
