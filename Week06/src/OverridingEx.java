class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은: " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("기본 무기의 살상 능력은: " + weapon.fire()); // 메소드 오버라이딩
	}

}
