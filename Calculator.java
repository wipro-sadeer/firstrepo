
public class Calculator {
	public static int powerInt(int num1,int num2) {
		 return(int) Math.pow(num1,num2);
	 }
	public static double powerDouble(double num1,int num2){
		double temp = num2;
		return Math.pow(num1, temp);
	}
}
