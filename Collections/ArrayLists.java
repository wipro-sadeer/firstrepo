package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLists {

	public static void main(String[] args) {
		six();
	}

	public static void one(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("purple");
		System.out.println(list);
	}
	public static void two(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add(0, "purple");
		System.out.println(list);
	}
	public static void three(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("purple");
		System.out.println(list.get(1));
	}
	public static void four(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.set(0, "purple");
		System.out.println(list);
	}
	public static void five(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("purple");
		list.add("white");
		list.remove(2);
		System.out.println(list);
	}
	//Write a Java program to search an element in an array list.
	public static void six(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("purple");
		list.add("white");
		System.out.println(list.get(1));
		
		System.out.println(list.indexOf("purple"));
	}
// Write a Java program to sort a given array list. 
	public static void seven(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("purple");
		list.add("white");
		list.add("bronze");
		Comparator<? super String> c = null;
		list.sort(c);
		System.out.println(list);
	}
//Write a Java program to copy one array list into another.  
		public static void eight(){
			ArrayList<String> list = new ArrayList<String>();
			list.add("yellow");
			list.add("purple");
			
			ArrayList<String> list2 = new ArrayList<String>();
			list2 = list;
			System.out.println(list);
			System.out.println(list2);
		}
//Write a Java program to reverse elements in an array list.
		public static void nine(){
			ArrayList<String> list = new ArrayList<String>();
			list.add("yellow");
			list.add("purple");
			
			Collections.reverse(list);
			System.out.println(list);
		}

}
