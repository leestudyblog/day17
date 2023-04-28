package exception;

import java.util.Scanner;

/*
 예외 종류
 - 강제 예외 : throw 
 - 예외 전가 : throws
 - 예외 처리: try ,catch
 *예외 처리 목적 
 - 프로그램을 꺼지지 않게 만든다
 */
public class MainClass01 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int x, y, result =0;
	
	System.out.println("수입력");
	x=sc.nextInt();
	y=sc.nextInt();
	try {
		result = x/y;// 예외 처리할 문장
		System.out.println("결과" + result); 
	} catch (ArithmeticException e) { // 문제 이유
		System.out.println("0으로 못나눔"); // 문제 발생 후 실행
	}
	
	System.out.println("다음 문장을 실행");
	
	}
	
	
	
	
	
}
