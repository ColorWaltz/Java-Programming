
public class Circle {

	int radius;
	String name;
	
	public Circle() { // 생성자
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String t) { // 인자가 2개인 생성자
		radius = r;
		name = t;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dounut = new Circle();
		dounut.name = "도넛피자";
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적은 " + area);
		
		

	}

}
