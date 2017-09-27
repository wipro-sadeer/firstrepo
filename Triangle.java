
public class Triangle extends Shape{

	public Triangle(){
		super();
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing triangle");
	}
	@Override
	public void erase(){
		System.out.println("erasing triangle");
	}
}
