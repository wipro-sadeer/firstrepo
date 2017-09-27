package Group;

public class Matrices {

	public Matrices() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int[][] array = { {1,2,9}, {3,5,8}, {6,7,4} };
		
		identifyHeavy(array);
	}
	public static void identifyHeavy (int[][] input1){
		int cornerSum = (input1[0][0] + input1[2][2] + input1[0][2] + input1[2][0]);
		int centerSum = (input1[0][1] + input1[1][0] + input1[1][2] + input1[2][1]);
		
		
		/*for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input1.length; j++) {
				if(input1[i][j] == input1[0][0]
						||input1[i][j] == input1[0][input1.length-1]
						|| input1[i][j] == input1[input1.length-1][0]
						||input1[i][j] == input1[input1.length-1][input1.length-1])	{
					cornerSum += input1[i][j];
					System.out.println("corner " + cornerSum);
				} else {
					if(input1[i][j] == input1[1][1]){
						centerSum -= input1[1][1];
					}
					centerSum += input1[i][j];
					System.out.println("center "+ centerSum);
				}
				
				
			}
		}*/
		
		if(cornerSum == centerSum){
			System.out.println("3");
		} else if (cornerSum > centerSum){
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}
