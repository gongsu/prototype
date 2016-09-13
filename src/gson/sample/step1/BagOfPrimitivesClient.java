package gson.sample.step1;

import com.google.gson.Gson;

public class BagOfPrimitivesClient {
	public static void main(String[] args){
		
		// (Serialization)
		BagOfPrimitives obj = new BagOfPrimitives();
		Gson gson = new Gson();
		String json = gson.toJson(obj); 
		System.out.println(json);
		
	}
	
}
