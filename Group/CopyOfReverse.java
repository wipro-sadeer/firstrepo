package Group;

public class CopyOfReverse {

	public static void main(String[] args) {
		getKey(-25, -32, 73);
	}

	public static void getKey (int input1, int input2, int input3){
		boolean negative1 = false;
		boolean negative2 = false;
		boolean negative3 = false;
		String output = "";
		if (input1 < 0){
			input1 *= -1;
			negative1 = true;
		}
		if (input2 < 0){
			input2 *= -1;
			negative2 = true;
		}
		if (input3 < 0){
			input3 *= -1;
			negative3 = true;
		}
		
		String input1rev = new StringBuilder(input1+"").reverse().toString();
		String input2rev = new StringBuilder(input2+"").reverse().toString();
		String input3rev = new StringBuilder(input3+"").reverse().toString();
		int sum = 0;
		
		if (negative1){
			input1rev= (Integer.parseInt(input1rev) *-1)+"";
		}
		if (negative2){
			input2rev= (Integer.parseInt(input2rev) *-1)+"";
		}
		if (negative3){
			input3rev= (Integer.parseInt(input3rev) *-1)+"";
		}
		sum += (Integer.parseInt(input1rev) + Integer.parseInt(input2rev) + Integer.parseInt(input3rev) );
		if (sum > 0){
			output = new StringBuilder(sum+"").reverse().toString();
		} else {
			sum*= -1;
			output = new StringBuilder(sum+"").reverse().toString();
			output= "-"+output;
			System.out.println(Integer.parseInt(output));
		}
		 //output = new StringBuilder(sum+"").reverse().toString();
		 
		System.out.println(output);
	}
}
