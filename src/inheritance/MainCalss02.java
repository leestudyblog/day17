package inheritance;

import java.util.ArrayList;

class A02 extends ArrayList<String>{ //arraylist 기능 상속
	
}

public class MainCalss02 {
	public static void main(String[] args) {
		A02 a01 = new A02();
		a01.add("111");
		System.out.println(a01.get(0));
		
	}

}
