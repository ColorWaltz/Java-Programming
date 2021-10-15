package week06_package01;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall(); // abstract
	void receiveCall();
	default void printLogo() {
		System.out.println("*** phone ***");
	}	
}

class Calc{
	public int calculator(int x, int y) {
		return x+y;
	}
}


class SamsungPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다");
	}
	
	public void schedule() {
		System.out.println("일정 관리 합니다");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		phone.schedule();
		System.out.println("3과 5를 더하면 >> " + phone.calculator(3, 5));
	}

}
