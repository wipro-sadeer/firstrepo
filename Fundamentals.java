import java.util.Arrays;
import java.util.Scanner;


public class Fundamentals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("question 1-16: ");
		int input = in.nextInt();
		switch (input){
		case 1:one(args);break;
		case 2:two(args);break;
		case 3:three(args);break;
		case 4:four(args);break;
		case 5:
			five(args);
			break;
		case 6:
			six(args);
			break;
		case 7:
			seven(args);
			break;
		case 8:
			eight(args);
			break;
		case 9:
			nine(args);
			break;
		case 10:
			ten(args);
			break;
		case 11:
			eleven();
			break;
		case 12:
			twelve();
			break;
		case 13:
			thirteen();
			break;
		case 14:
			fourteen(args);
			break;
		case 15:
			fifteen();
			break;
		case 16:
			sixteen();
			break;
		}
	}

	public static void one(String[] args){
		String a = args[0];
		String b = args[1];

		String c = args[0]+""+args[1];
		System.out.println(c);
	}
	
	public static void two(String[] args){
		String a = args[0];
		String b = args[1];
		
		if (a.equals(b)){
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
	public static void three(String[] args){
		String a = args[0];
		String b = args[1];
		String c = new StringBuilder(b).reverse().toString();
		String d = a + c;
		System.out.println(d);
	}
	public static void four(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void five(String[] args){
		int a = Integer.parseInt(args[0]);
		if (a < 0){
			System.out.println(a + " is negative");
		} else if (a > 0){
			System.out.println(a + " is positive");
		} else {
			System.out.println(a + " is 0");
		}
	}
	public static void six(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		for (int i = a; i<=b; i++){
			if (i%2==0){
				System.out.println(i);
			}
		}
		
	}
	public static void seven(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		//loop through all numbers between a and b
        for (int i = a; i<b; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
	}
	public static void eight(String[] args){
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		if (a.equals("male") || (a.equals("female"))){ 
			if (a.equals("female") && (b >=1 && b <=58)){
				System.out.println("interest rate is 8.2");
			} else if (a.equals("female") && (b >=59 && b <=120)){
				System.out.println("interest rate is 7.6");
			} else if (a.equals("male") && (b >=1 && b <=60)){
				System.out.println("interest rate is 9.2");
			} else if (a.equals("male") && (b >=61 && b <=120)){
				System.out.println("interest rate is 8.3");
			} else {
				System.out.println("none");
			}
		} else {
			System.out.println("not male or female");
		}
/*The interest rate is 8.2%, if gender is Female and Age is between 1 to 58
The interest rate is 7.6%, if gender is Female and Age is between 59 to 120
The interest rate is 9.2%, if gender is Male and Age is between 1 to 60
The interest rate is 8.3%, if gender is Male and Age is between 61 to 120
*/
	}
	public static void nine(String[] args){
		int a = Integer.parseInt(args[0]);//day
		switch (a){
		case 1:
			System.out.print("jan");
			break;
		case 2:
			System.out.print("feb");
			break;
		case 3:
			System.out.print("march");
			break;
		case 4:
			System.out.print("april");
			break;
		case 5:
			System.out.print("may");
			break;
		case 6:
			System.out.print("june");
			break;
		case 7:
			System.out.print("july");
			break;
		case 8:
			System.out.print("august");
			break;
		case 9:
			System.out.print("september");
			break;
		case 10:
			System.out.print("october");
			break;
		case 11:
			System.out.print("november");
			break;
		case 12:
			System.out.print("december");
			break;
		default:
			System.out.println("Not a valid month");
		}
	}
	public static void ninepoint5(String[] args){
		int a = Integer.parseInt(args[0]);//day
		int b = Integer.parseInt(args[1]);//month
		
		switch (b){
		case 2:
			if (a > 28 || a < 1){
				System.out.println("not valid1");
			} else {
				System.out.println("valid2");
			}
				break;
			
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (a > 31 || a < 1){
				System.out.println("not valid3");
			} else {
				System.out.println("valid4");
			}
			break;
		case 4:  case 6: case 9: case 11:
			if (a > 30 || a < 1){
				System.out.println("not valid5");
			} else {
				System.out.println("valid6");
			}
			break;
		default:
			System.out.println("not valid7");
			break;
		}
	}
	public static void ten (String[] args){
		String a = args[0];
		//int b = Integer.parseInt(a);
		    System.out.println(a.equals(new StringBuilder(a)
		    .reverse().toString()));
	}
	
	public static void eleven (){
		int n = 1;
		int count = 0;
		while (count !=5){
			if (n%2 == 0 && n%3==0 & n%5==0){
				System.out.println(n);
				count++;
			}
			n++;
		}
	}
	public static void twelve (){
		Scanner in = new Scanner(System.in);
		boolean running = true;
		do { 
		int int1,int2 = 0;
		System.out.println("Would you like + or -");
		String input = in.nextLine();
		
		switch(input){
		case "+":
			System.out.print("integer1: ");
			int1 = in.nextInt();
			System.out.print("integer2: ");
			int2 = in.nextInt();
			System.out.println("Output: "+ (int1 + int2));
			break;
		case "-":
			System.out.print("integer1: ");
			int1 = in.nextInt();
			System.out.print("integer2: ");
			int2 = in.nextInt();
			System.out.println("Output: "+ (int1 - int2));
			break;
		default:
			System.out.println("Error");
			
			break;
		}
		System.out.println("Would you like to try again? y/n:");
		in.nextLine();//reset scanner cache
		String retry = in.nextLine();
		if (retry.equals("y")){
			running = true;
		} else {
			running = false;
		}
	} while (running);	
	}
	public static void thirteen(){
		int[] array = { 1,2,3,4,5,6,7,8,9,21,-6};
		
		int max = 0;
		int min = 100000;
		
		for( int i = 0; i<array.length; i++){
			if(min > array[i]){
				min = array[i];
			}
			if(max < array[i]){
				max = array[i];
			}
		}
		System.out.println("min :"+ min +", max: "+ max);
	}
	/*. Write a program to initialize an integer array with values and check if a given number is present in the
array or not. If the number is not found, it will print -1 else it will print the index value of the given number
in the array*/
	public static void fourteen(String[] args){
		boolean found = false;
		int a = Integer.parseInt(args[0]);
		int[] array = { 1,7,3,5};
		
		for (int i = 0; i < array.length; i++){
			if (a==array[i]){
				System.out.println(i);
				found = true;
			}
		}
		if (!found){
			System.out.println("-1");
		}
	}
	public static void fifteen(){
		int[] array = {1,7,3,3,5,3};
		Arrays.sort(array);
		int temp = array[0];
		boolean found = false;

		for (int i = 0; i<array.length;i++){
			if(temp == array[i] && !found){
				found = true;
			} else if (temp != array[i]){
				System.out.println(" "+ temp);
				temp = array[i];
				found = false;
			}
		}
		System.out.println(" " + temp);//last digit	
	}
	public static void sixteen(){
		int[] array = {1,7,3,3,5,3};
		int temp = array[0];
		int highestCount = 0;
		for (int i = 0; i < array.length; i++) {
		    int x = array[i];
		    int count = 1; //each appears at least once
		    for (int j = 0; j < array.length; j++) {
		        if (x == array[j]){
		        	count++;
		        }
		        if (highestCount < count) {
		            highestCount = count;
		            temp = x;
		        } 
		    }
		}
		System.out.println(temp);
	}
}