package automobile;

import automobile.twowheeler.Hero;
import automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		Hero hero = new Hero(15,true);
		Honda honda = new Honda(20,false);
		
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed());
		//System.out.println(hero.radio());
		
		System.out.println(honda.getSpeed());
		//System.out.println(honda.cdplayer());
	}

}
