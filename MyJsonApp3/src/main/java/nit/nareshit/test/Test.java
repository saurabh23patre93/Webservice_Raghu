package nit.nareshit.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import nit.nareshit.model.Address;
import nit.nareshit.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			List<String> al=new ArrayList();
			al.add("P1");al.add("P2");al.add("P3");
			
			Set<String> set=new HashSet();
			set.add("M1");set.add("M2");set.add("M3");
			
			Map<String,Integer> map=new HashMap();
			map.put("V1",12);map.put("V2",13);map.put("V3",14);
			
			Address addr=new Address();
			addr.setHno("5/62/A");
			addr.setLoc("HYD-IND");
			
			
			//1.create your class object
			Employee e=new Employee();
			e.setEid(10001);
			e.setEname("Saurabh");
			e.setEsal(45455.0f);
			e.setEprjs(al);e.setModules(set);e.setPrjver(map);
			e.setAddr(addr);
			
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
