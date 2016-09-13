package gson.sample.step1;

import com.google.gson.Gson;

public class PrimitiveExample {

	public static void main(String[] args) {
		Gson gson=new Gson();
		//serialization
		System.out.println(gson.toJson(1));
		System.out.println(gson.toJson("1"));
		System.out.println(gson.toJson(new Long(10)));
		System.out.println(gson.toJson(10L));
		
		Integer[] iValues = {1,2};
		System.out.println(gson.toJson(iValues));  
		
		String[] sValues = {"1","2"};
		System.out.println(gson.toJson(sValues)); 
		
		
		//Deserialization
		System.out.println("-------------------------");
		
		int a2 = gson.fromJson("1", int.class);
		Integer a3 = gson.fromJson("1", Integer.class);
		Long a4 = gson.fromJson("1", Long.class);
		Boolean a5 = gson.fromJson("false", Boolean.class);
		String a6 = gson.fromJson("\"abc\"", String.class);
		String[] a7 = gson.fromJson("[\"abc\", \"bcd\"]", String[].class);
		
		System.out.println("-------------------------" + a7.length);
		
	}
	
}
