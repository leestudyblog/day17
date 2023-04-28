package inheritance;

class A09{
	String s ="부모";
	private int num = 100;
	protected int num1=100; //외부의 접급 불가능 자식에게는 허용 +같은 패키지도 허용
	// private < default(없음) < protected < public
}

class B09 extends A09{
	public void test() {
		String s ="자식";
		//System.out.println(num); 부모자식 간간 private 상속 불가능
		System.out.println(num1);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}

public class MainClass09 {
	public static void main(String[] args) {
		B09 b =new B09();
		b.test();
	}

}
