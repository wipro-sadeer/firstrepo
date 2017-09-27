package Group;

public class digitSum {

	public digitSum() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int input = -56090;
		String input2 = input+"";
		int sum = 0;
		boolean negative = false;
		do {
		 sum = 0;
		if((input2.charAt(0)+"").equals("-")){
			System.out.println("negative");
			input = input * -1;
			input2 = input+"";
			 negative = true;
		}
			
			for (int i = 0; i < input2.length(); i++) {
				sum += Integer.parseInt(input2.charAt(i)+"");
				//System.out.println(sum);
			}
			input2 = sum+""; 
		}while (sum > 9);
		if (negative){
			sum = sum*-1;
		}
		System.out.println(sum);
	}
}
