package gson.sample.step1;

import com.google.gson.Gson;

public class ArrayExample {

	public static void main(String[] args) {
		Gson gson = new Gson();
		int[] ints = {1, 2, 3, 4, 5};
		String[] strings = {"abc", "def", "ghi"};
		
		// (Serialization)
		System.out.println( gson.toJson(ints));// ==> prints [1,2,3,4,5]
		System.out.println( gson.toJson(strings));// ==> prints ["abc", "def", "ghi"]
		
		
		
		// (Deserialization)
		int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
		System.out.println( ints2.length);
		// ==> ints2 will be same as ints

	}

}
