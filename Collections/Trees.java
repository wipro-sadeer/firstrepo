package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Trees {

	public static void main(String[] args) {
		eight("BLOO");
	}
	
	public static void one(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		
		System.out.println(tree);
	}
	public static void two(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		
		for (String element : tree){
			System.out.println(element);
		}
	}
	public static void three(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		
		Iterator<String> i =tree.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	public static void four(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		
	}
	public static void five(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		
		System.out.println(tree.size());
	}
	
	public static void six(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		Object first = tree.first();
		//System.out.println(tree.first());
		tree.remove(first);
		//tree.remove(0+"");
		System.out.println(tree);
	}
	public static void seven(){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Yellow");
		tree.add("BLOO");
		Object last = tree.last();
		tree.remove(last);
		System.out.println(tree);
	}
	public static void eight(String item){
		TreeSet<String> tree = new TreeSet<String>();

		tree.add("Yellow");
		tree.add("BLOO");
		tree.add("Yellow");
		tree.add("BLOO");
		Object search = item;
		tree.remove(search);
		System.out.println(tree);
	}
}
