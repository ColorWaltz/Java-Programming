
public class AutoBoxingUpBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
		Integer intObject = n; // boxing
		System.out.println("intObject = " + intObject); // 10
		
		int m = intObject + 10; // unboxing
		System.out.println("m = " + m); //20 
	}

}
