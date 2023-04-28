package inheritance;

class A06 {
	public A06(String s) {
		System.out.println( s+ "부모실행");
	}
	public A06() {} // default 생성자 ->자식만 실행하고 싶을 때 오류 줄임
}
class B06 extends A06{
	public B06() {
		System.out.println( "자식생성자 실행"); //매개변수를 전달받지 않는 생성자 실행
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		B06 b = new B06();
	}

}
