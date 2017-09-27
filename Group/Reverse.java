package Group;

public class Reverse {

	public static void main(String[] args) {
		getKey(-25, -32, 73);
	}

	public static void getKey (int input1, int input2, int input3){
		
		int[] array = { input1, input2, input3};
		String[] rev = new String[3];
		int sum = 0;
		String output = "";
		
		for (int i = 0; i < 3; i++) {
			rev[i] = new StringBuilder(array[i]+"").reverse().toString();
			if (rev[i].endsWith("-")){
				rev[i] = ("-"+rev[i].substring(0, rev[i].length()-1));
			}
			sum+= Integer.parseInt(rev[i]);
			
		}
		
		if (sum > 0){
			System.out.println(sum);
		} else {
			sum*= -1;
			output = new StringBuilder(sum+"").reverse().toString();
			output= "-"+output;
			System.out.println(Integer.parseInt(output));
		}

	}
}
