
public class Square extends Shape{

	public Square(){
		super();
	}
	@Override
	public void draw(){
		System.out.println("Drawing square");
	}
	@Override
	public void erase(){
		System.out.println("erasing square");
	}
}
