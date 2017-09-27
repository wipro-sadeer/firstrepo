package automobile.twowheeler;

public class Hero extends automobile.Vehicle {
	private int speed;
	private boolean radio;
	public Hero(int speed, boolean radio) {
		this.speed = speed;
		this.radio = radio;
	}
	public int getSpeed(){
		return this.speed;
	}
	public void radio(){
		this.radio = true;
	}

}
