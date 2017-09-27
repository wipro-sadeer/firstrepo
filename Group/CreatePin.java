package Group;

public class CreatePin {
public static void main(String[] args) {
	int alpha = 1234%10;//last digit
	int beta = 5678;///middle
	int gamma = 9012;//first
	
	 if ((beta >= 10) && (beta < 1000)){
		beta = (beta/10)%10;
		System.out.println("beta1");
	} else {
		String betatemp = (beta+"");
		System.out.println("beta2");

		System.out.println(betatemp +" betatemp");
		beta = betatemp.charAt(betatemp.length()-2); 
		System.out.println("beta "+ beta);
	}
	if (gamma <100){
		gamma = gamma %10;
	} else {
		String gammatemp = (gamma+"").substring(0,1);
		gamma = Integer.parseInt(gammatemp);
	}
	System.out.println(alpha);
	System.out.println(beta);
	System.out.println(gamma);
	System.out.println(gamma +""+ beta +""+ alpha+"");
	
	int x = 1234;
	String y = x+"";
	System.out.println(y.charAt(y.length()-2));
	
	int beta2 = 1234;
	String betatemp = beta2+"";
	beta2 = betatemp.charAt((betatemp.length())-2); 
	System.out.println("beta "+ beta2);
	
}
}
