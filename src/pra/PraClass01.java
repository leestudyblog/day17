/*
 에어컨  <- 부모클래스 
기본 온도 설정 (UP,DOWN,ON,OFF)기능을 갖고있는상태로 
회사별 (EX:삼성,엘지)만의 기능설정하기
삼성 -> 공기 정화 , 히터가 가능 추가
엘지 -> 디자인 변화, 말하는 기능 추가 
위니아 -> 풍량 조절 풍속 조절 기능 추가
 */

package pra;

import java.util.Scanner;

class Aircon{
	Scanner sc = new Scanner(System.in);
	
	protected int temp = 30; //기본 온도 설정
	
	public void UP() {
		System.out.println("온도올림");
		System.out.println("수 입력:");
		int inputNum =0;
		inputNum= sc.nextInt();
		if(inputNum !=0) {
			temp += inputNum;
		}else {System.out.println("다시입력");}
		System.out.println("현재 온도 : " + temp);
	}
	public void DOWN() {
		System.out.println("온도내림");
		System.out.println("수 입력:");
		int inputNum =0;
		inputNum= sc.nextInt();
		if(inputNum !=0) {
			temp -= inputNum;
		}else {System.out.println("다시입력");}
		System.out.println("현재 온도 : " + temp);
	}
	public void ON() {
		System.out.println("전원 ON");
}
	public void OFF() {
		System.out.println("전원 OFF");
	
} 
	public void menu() {
		System.out.println("1.온도 올림 2.온도 내림 3.ON 4.OFF");
	
	}
	}


	class Samsung extends Aircon{
		public void info_s() {
			System.out.println("5.공기정화 6.히터 기능");

		}
		
		public void freshAir() {
			System.out.println("공기정화");

		}
		public void hit() {
			System.out.println("히터 기능");

		}
	}
	
	
	class LG extends Aircon{
		public void digChange() {
			System.out.println("디자인 변경");

		}
		public void speak() {
			System.out.println("말하기기능");

		}
		public void info_l() {
			System.out.println("5.디자인 변경 6.말하기기능");

		}
	}
	
	
	class Winia extends Aircon{
		public void wind1() {
			System.out.println("풍속조절");

		}
		public void wind2() {
			System.out.println("풍량조절");
			
		}
		public void info_W() {
			System.out.println("5.풍속조절 6.풍량조절");

		}
		
	}
	
public class PraClass01 {
	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		Samsung s= new Samsung();
		LG l = new LG();
		Winia w= new Winia();
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		int num=0;
		while (bool) {
			System.out.println("회사 선택");
			System.out.println("1.삼성 2.LG 3.위니아");
			num = sc.nextInt();
			switch(num) {
			case 1: 
				System.out.println("삼성 에어컨");
				aircon.menu();
				s.info_s();
				System.out.println("선택하시오");
				num = sc.nextInt();
				switch(num) {
				case 1: 
					aircon.UP();
					break;
				case 2: 
					aircon.DOWN();
					break;
				case 3:
					aircon.ON();
					break;
				case 4: 
					aircon.OFF();
					break;
				case 5: 
					s.freshAir();
					break;
				case 6: 
					s.hit();
					break;
				}
				
					
				break;
			case 2: 
				System.out.println("LG 에어컨");
				aircon.menu();
				l.info_l();
				System.out.println("선택하시오");
				num = sc.nextInt();
				switch(num) {
				case 1: 
					aircon.UP();
					break;
				case 2: 
					aircon.DOWN();
					break;
				case 3:
					aircon.ON();
					break;
				case 4: 
					aircon.OFF();
					break;
				case 5: 
					l.digChange();
					break;
				case 6: 
					l.speak();
					break;
				}
				System.out.println("LG");
				break;
			case 3: 
				System.out.println("LG 에어컨");
				aircon.menu();
				w.info_W();
				System.out.println("선택하시오");
				num = sc.nextInt();
				switch(num) {
				case 1: 
					aircon.UP();
					break;
				case 2: 
					aircon.DOWN();
					break;
				case 3:
					aircon.ON();
					break;
				case 4: 
					aircon.OFF();
					break;
				case 5: 
					w.wind1();
					break;
				case 6: 
					w.wind2();
					break;
				}
				System.out.println("LG");
				System.out.println("위니아");
				break;
			}
		}
		
		
		
	}
	
	
	
}
