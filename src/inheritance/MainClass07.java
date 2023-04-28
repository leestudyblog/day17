package inheritance;

import java.util.ArrayList;

class A07 extends ArrayList<String>{
	public void test() {
		super.add("");
		System.out.println("부모 테스트 실행");
	}
}

class B07 extends A07{
	public void bbb() {
		System.out.println("bbb 실행");
		//test();
		super.test();
		this.test();

	}
	public void test() { //오버라이딩
		System.out.println("자식 테스트 실행");
	}
	
	
}
public class MainClass07 {
	public static void main(String[] args) {
		B07 b = new B07(); 
		b.bbb(); // 자기 자신 안에서 먼저 찾는다. 이후 없으면 부모 클래스에서 찾는다.
		//b.test();
		
	}

}
