package com.nt.test;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.nt.model.Address;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Employee emp=new Employee();
			emp.setEmpId(10);
			emp.setEmpName("Saurabh");
			emp.setEmpSal(200.0);
			emp.setEmpPwd("ABCD");
			
			Set<String> prjs=new HashSet<>();
			prjs.add("NIT");
			prjs.add("ORACLE");
			prjs.add("AVT");
			
			emp.setEmpPrjs(prjs);
			
			Map<String,String> clients=new LinkedHashMap<>();
			clients.put("C3","HORY");
			clients.put("C2", "MEGA CORP");
			clients.put("C1", "ACT-COM");
			
			emp.setClients(clients);
			
			Address addr=new Address();
			addr.setHno("9-99/A-5");
			addr.setLoc("HYD");
			
			emp.setAddrs(addr);
			
			JAXBContext context=JAXBContext.newInstance(Employee.class);
			Marshaller m=context.createMarshaller();
			m.marshal(emp,new File("E:/logs.xml"));
			System.out.println("DONE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
