class Point{
	private int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x +","+ y + ")"); // (x,y)
	}
}

class ColorPoint extends Point{ // Point가 들어옴
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint c = new ColorPoint();
		c.set(3,4);
		c.setColor("red");
		c.showColorPoint();
	}

}
