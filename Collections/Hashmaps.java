package Collections;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		five();
	}
	public static void one(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(2, "sam");
		hash.put(50, "markus");
		hash.put(63, "john");
		System.out.println(hash);
	}
	public static void two(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(2, "sam");
		hash.put(50, "markus");
		hash.put(63, "john");
		int sum = hash.size();
		System.out.println(sum);
	}
	public static void three(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(2, "sam");
		hash.put(50, "markus");
		hash.put(63, "john");

		System.out.println(hash.get(50));
	}
	public static void four(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(2, "sam");
		hash.put(50, "markus");
		hash.put(63, "john");
		
		System.out.println(hash.keySet());
	}
	public static void five(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(2, "sam");
		hash.put(50, "markus");
		hash.put(63, "john");
		
		System.out.println(hash.values());
	}
}
