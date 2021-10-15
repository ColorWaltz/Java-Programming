public class ex02_04 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // 227
		System.out.println(10/4); // 2 
		System.out.println(10.0/4.0); // 2.5
		System.out.println((byte)(b+i)); // 227 = 128 + 128 - 27
		System.out.println((int)2.9+1.8); // 2 + 1.8 = 3.8
		System.out.println((int)(2.9+1.8)); // (int)4.7 = 4 
		System.out.println((int)2.9 + (int) 1.8); // 2+1 = 3
	}

}
