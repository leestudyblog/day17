package inheritance;

/*상속
  - 부모, 자식, 관계를 가지고 있다. 
  - 부모가 가지고 있는 코드를 그대로 물려받아 사용하는 것
  - Extends 를 사용하여 상속 받는다
 */
class Calc {
	public void Clac() {
		System.out.println("나는 계산기야");
	}
}

class Com extends Calc {
	public void computer() {
		System.out.println("나는 컴퓨터야");

	}
}

public class MainClass01 {
	public static void main(String[] args) {
		//Calc c = new Calc();
		//c.Clac();
		
		Com com = new Com();
		com.Clac();
		com.computer();
		
		
	}

}
