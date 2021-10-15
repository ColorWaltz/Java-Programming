import java.util.StringTokenizer;

public class StringTokenzerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		
		while(st.hasMoreTokens()) { // ÅäÅ«ÀÌ ÀÖ´Â µ¿¾È while¹® ½ÇÇà
			System.out.println(st.nextToken());
		}
	}

}
