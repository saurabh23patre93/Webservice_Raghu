package in.nareshit.ex;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.model.Student;

public class Test {

	public static void main(String[] args) {
		try {
			//1.Create your class object
			Student sob=new Student();
			sob.setStdId(1000);
			sob.setStdName("saurabh");
			sob.setStdFee(25000.0);
			
			//2.Create obj to ObjectMapper(C)
			ObjectMapper om=new ObjectMapper();
			
			//3.Call write__(object):json method
			//String json=om.writeValueAsString(sob);
			//System.out.println(json);
			
			om.writeValue(new File("E:/stds.json"),sob);
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
