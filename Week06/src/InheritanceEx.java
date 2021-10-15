class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {	
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 180;
		// weight는 private으로 선언된 변수라서 불러올 수 없음
		setWeight(71); // 간접 호출은 가능 
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
		
		System.out.println("나이: " + s.age +"\n이름: " + s.name + "\n키: " + s.height + "\n몸무게: " + s.getWeight());
	}

}
