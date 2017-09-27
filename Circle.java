
public class Circle extends Shape{

	public Circle(){
		super();
	}
	@Override
	public void draw(){
		System.out.println("Drawing circle");
	}
	@Override
	public void erase(){
		System.out.println("erasing circle");
	}
}
