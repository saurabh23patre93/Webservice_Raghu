package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.ExamData;
import com.nt.model.Student;

public class Test {

	public static void main(String[] args) {
		try {
			Set<String> set=new HashSet();
			set.add("M1");set.add("M2");set.add("M3");
			
			List<String> list=new ArrayList();
			list.add("P1");list.add("P2");list.add("P3");
			
			ExamData examData=new ExamData();
			examData.setGrade("A");
			examData.setResult("Pass");
			examData.setTotalMarks(600);
			
			//1. Create model class object
			Student st=new Student();
			st.setSid(1000);
			st.setSname("Saurabh");
			st.setSfee(10000.0);
			st.setSubj(set);
			st.setMarks(list);
			st.setExamData(examData);
			
			//2. create object of ObjectMapper
			ObjectMapper om = new ObjectMapper();
			
			//3. convert emp to JSON Format
			String json = om.writeValueAsString(st);

			//4. print data
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
