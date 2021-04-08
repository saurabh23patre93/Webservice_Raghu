package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class MarshallingTest {

	public static void main(String[] args) {
		try {
			Student std=new Student();
			std.setStdid(100);std.setStdName("SAMPLE");
			std.setStdFee(1220.0);
			
			//1.Create Context object for student
			JAXBContext context=JAXBContext.newInstance(Student.class);
			
			//2.Create UnMarshaller
			//Unmarshaller um=context.createUnmarshaller();
			//2.Create Marsherller
			Marshaller m=context.createMarshaller();
			System.out.println(m.getClass().getName());
			
			//3.Call Unmarshal
			//Student st=(Student) um.unmarshal(new File("E:/data.xml"));
			
			//3.Call Marshel method
			m.marshal(std,new File("E:/data.xml"));
			
			//Print data
			//System.out.println(st);
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
