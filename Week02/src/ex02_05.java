import java.util.Scanner;

public class ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String city;
		int age;
		double weight;
		boolean single;
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next(); 
		System.out.println("당신의 이름은 " + name + "입니다.");
		city = scanner.next(); 
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		age = scanner.nextInt(); 
		System.out.println("당신의 나이는 " + age + "살입니다.");
		weight = scanner.nextDouble(); // 실수 토큰 읽기
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		single = scanner.nextBoolean();
		System.out.println("당신은 독신 여부는 " + single + "입니다.");
		scanner.close();
	}

}
