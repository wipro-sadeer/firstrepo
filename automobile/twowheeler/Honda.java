package automobile.twowheeler;

public class Honda extends automobile.Vehicle {
	private int speed;
	private boolean cd;
	public Honda(int speed, boolean cd) {
		this.speed = speed;
		this.cd = cd;
	}
	public int getSpeed(){
		return this.speed;
	}
	public void cdplayer(){
		this.cd = false;
	}

}
