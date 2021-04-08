package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class UnMarshallingTest {

	public static void main(String[] args) {
		try {
			//1.create Context object for student
			JAXBContext context=JAXBContext.newInstance(Student.class);
			
			//2.create Unmarshaller
			Unmarshaller um=context.createUnmarshaller();
			
			//3.call unmarshaller
			Student st=(Student) um.unmarshal(new File("E:/data.xml"));
			
			//Print data
			System.out.println(st);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
