package com.nt.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestTwo {
	public static void main(String[] args) {
		
		Map<String,String> clients=new LinkedHashMap<>();
		clients.put("C3","HORKYO");
		clients.put("C2","MEGA");
		clients.put("C1","ACT");
		
		//Convert map to  Set<entity>
		Set<Entry<String,String>> entries=clients.entrySet();
		//call Iterator
		Iterator<Entry<String,String>> itr=entries.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String,String> entry=itr.next();
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
