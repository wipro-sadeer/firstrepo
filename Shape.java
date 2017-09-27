/*The draw () method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
The erase () method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of
the class by calling draw () and erase () method using each object.
Shape c=new Circle ();
Shape t=new Triangle ();
Shape s=new Square ();
*/
public class Shape {
	public Shape(){
		draw();
		erase();
	}
	public void draw(){
		System.out.println("Drawing shape");
	}
	public void erase(){
		System.out.println("Erasing shape");
	}
	public static void main(String[] args) {
		Shape c=new Circle ();
		Shape t=new Triangle ();
		Shape s=new Square ();
	}
}
