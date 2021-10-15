
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb;
		sb = new StringBuffer("This");
		
		sb.append(" is pencil"); //문자열 덧붙이기
		System.out.println(sb); // This is pencil
		
		sb.insert(7, " my"); 
		System.out.println(sb); // This is my pencil
		
		sb.replace(8,10,"your"); 
		System.out.println(sb); // This is your pencil
		
		sb.delete(8, 13);
		System.out.println(sb); // This is pencil
		
		sb.setLength(4);
		System.out.println(sb); // This
	}

}
