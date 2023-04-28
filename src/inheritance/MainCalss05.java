package inheritance;

class A05{
	public A05(int num) {
		System.out.println(num +"생성자");
	}
}

 // class B05 extends A05{ 오류 - 부모 생성자 전달값 없음
	class B05 extends A05{
		public B05(int n1) {
			super(n1); //부모클래스에 값 전달 
			System.out.println("자식생성자");
		}
	}


public class MainCalss05 {
	public static void main(String[] args) {
		A05 a = new A05(100);
		B05 b =new B05(100);
		
	}
}
