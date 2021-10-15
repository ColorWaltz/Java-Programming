
public class ArrayPassing {
	
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==' ')		// 공백 들어오면
				a[i] = ',';		// , 로 바꾸기
		}
	}

	static void printCharArray(char a[]) {
		for(int i =0; i<a.length; i++){
			System.out.print(a[i]);	
		}
		System.out.println();  // 줄바꿈
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'C', 'o', 'l', 'o','r',' ','W','a','l','t','z'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		}

}
