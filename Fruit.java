
public class Fruit {
	public Fruit(String name, String taste, int size){
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
private String name;
private String taste;
private int size;

public void eat(String name, String taste, int size){
	this.name = name;
	this.taste = taste;
	this.size = size;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTaste() {
	return taste;
}
public void setTaste(String taste) {
	this.taste = taste;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
}
