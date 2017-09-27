package Strings;

import java.util.Scanner;
import java.util.Stack;

public class Strings {


	public static void main(String[] args) {
		nine("wipro",3);
	}
	public static void one(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = in.nextLine();
		System.out.println(input.equals(new StringBuilder(input)
	    .reverse().toString()));
	}
	public static void two(String name1, String name2){
		char x = name1.charAt(name1.length()-1);
		char y = name2.charAt(0);
		if (x!=y){
			System.out.println(name1 + name2.toLowerCase());
		} else {
		System.out.println(name1+ name2.substring(1).toLowerCase());
		}
	}
	/*Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the
length of the string. The string may be of any length.
If input is ""Wipro"" then output should be ""WiWiWiWiWi""
*/
	public static void three(String input){
		String spam = input.substring(0, 2);
		for (int i = 0; i < input.length(); i++) {
			System.out.print(spam);
		}
	}
	public static String four(String input){
		int i = input.length();
		if(i%2==0){
			return input.substring(0, (i/2));
		} else {
			return null;
		}
		
	}
	/*5. Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The input string
length will be at least 2 characters*/
	public static String five(String input){ 
		return input.substring(1, input.length()-1);
		
	}
	/*6. Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the
string unchanged. If the input is "xHix", then output is "Hi"*/
	public static String six(String input){ 
		String x = "x".toLowerCase();
		if(input.startsWith(x)){
			input = input.substring(1);
		}
		if (input.endsWith(x)){
			return input.substring(0, input.length()-1);
		} else {
			return input;
		}
		
	}
	/*7. Return a version of the given string, where for every star (*) in the string the star and the chars
immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad"*/
	public static void seven(String input){ 
		//char x = "*";
		
		Stack<String> stack = new Stack<String>();//create stack
		for (int i = 0; i < input.length(); i++) {//loop through the string
			//if input is a valid character(not a *)
			if (input.charAt(i)!='*'){
				stack.push(input.charAt(i)+"");//push character into stack	
			} else if(input.charAt(i)=='*' && (i < input.length()-1) ) {//if * not at end
				 if ( (input.charAt(i)=='*' && (input.charAt(i+1) != '*'))){//if * followed by *
					 stack.push(input.charAt(i+1)+"" );// add character after * to stack
					 i++; 
				
					 //pop character to right of stars
					 if (!stack.isEmpty()){
						 stack.pop();
					 }
					 //pop character to left of stars
					 if (!stack.isEmpty()){
						 stack.pop();
					 }
				 }
			} else {
				
				 }
		}
		System.out.println(stack);
	}
	public static void eight(String a, String b){
		String longest,shortest = "";
		String newOutput = "";
		if (a.length() >= b.length()){
			longest = a;
			shortest = b;
		} else {
			longest = b;
			shortest = a;
		}
		for (int i = 0; i < longest.length(); i++) {
			newOutput += longest.charAt(i);
			if  (shortest.length() > i){
				newOutput += shortest.charAt(i);
			}
				
				
		}
		System.out.println(newOutput);
	}

	/* Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You
may assume that n is between 0 and the length of the string, inclusive. For example, if the inputs are
“Wipro” and 3, then the output should be “propropro”*/
	public static void nine(String a, int b){
		String spam = a.substring(a.length()-b);
		
		for (int i = 0; i < b; i++) {
			System.out.print(spam);
			
		}
	}
}
