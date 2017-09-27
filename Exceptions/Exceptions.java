package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public Exceptions() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		two();
	}
	public static void one (){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		try {
			String input = in.nextLine();
			int output = Integer.parseInt(input);
			output = output*output;
			System.out.println("square value: " + output);
		} catch (NumberFormatException e){
			System.out.println("Input is not a valid format for an integer");
		}
	}
	public static void two (){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		
		try {
			int x= in.nextInt();
			int[] input = new int[x];
			for (int i = 0; i < x; i++) {
				System.out.println("Enter element "+ " in the array");
				input[i] = in.nextInt();
			}
			System.out.print("Enter the index of array u want to access: ");
			int index = in.nextInt();
			System.out.println(input[index]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Input is not a valid format for an integer");
		}
	}
}
