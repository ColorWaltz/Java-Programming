
public class Circle02 {
	int radius;
	public Circle02 (int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle02[] c;
		c = new Circle02[5];
		
		for(int i = 0; i<c.length; i++) {
			c[i] = new Circle02(i);
		}
		
		for(int i = 0; i<c.length; i++) {
			System.out.println((int)(c[i].getArea())); // 사칙 연산으로 발생하는 쓰레기 값 방지 
		}
		
	}

}
