import java.util.StringTokenizer;

public class StringTokenzerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		
		while(st.hasMoreTokens()) { // ��ū�� �ִ� ���� while�� ����
			System.out.println(st.nextToken());
		}
	}

}
