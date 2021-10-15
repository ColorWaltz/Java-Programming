package week06_package01;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		paint(shape);
		
		Line line = new Line();
		paint(line);
		
		paint(new Rect());
		
		paint(new Circle());
	}

}
