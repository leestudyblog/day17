package inheritance;
//상속 X 예시
import java.util.ArrayList;

class A03{
	private	ArrayList<String> arr;
	public A03() {
		arr = new ArrayList<>();
	}
	public ArrayList<String> getArr(){
		return arr;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		A03 a =new A03();
		ArrayList<String > arr = a.getArr();
		arr.add("111");
		System.out.println(arr.get(0));
		
	}
}
