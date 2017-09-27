package Abstract;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		//Declare an array of Compartment of size 10. 
		/*Create a compartment of a type as decided by a randomly 
		 * generated integer in the range 1 to 4.
		 *  Check the polymorphic behavior of the notice method. */
		Compartment c[] = new Compartment[10]; 
		
		for (int i = 0; i < c.length; i++) {
			Random r = new Random();
			int n = r.nextInt(4);
			
			switch(n){
			case 0:
				c[i] = new FirstClass();
				break;
			case 1:
				c[i] = new General();
				break;
			case 2:
				c[i] = new Ladies();
				break;
			case 3:
				c[i] = new Luggage();
				break;
			}
		}
	}
}