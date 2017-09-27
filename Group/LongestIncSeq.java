package Group;

import java.util.Scanner;

public class LongestIncSeq {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int length = in.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Value for index "+(i+1)+": ");
			arr[i] = in.nextInt();
		}
		lemon(arr);
	}
	public static void lemon (int[] arr){
		int count = 1;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i!= arr.length-1){ //if not last element
				if (arr[i] <= arr[i+1]){ //compare to next value thing
					count++;
				} else {
					if (count > temp){
						temp = count;
					}
					count = 1;
				}
			}
		}
		if (temp >= count){
			System.out.println(temp);
		} else {
			System.out.println(count);
		}
	}
}
