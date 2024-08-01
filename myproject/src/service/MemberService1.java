package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberService1 {

	private Scanner sc = new Scanner(System.in);

	/**
	 * 고의적 예외 발생.
	 */

	public void test() {
		
		// NullPointerException
		// 참조하려는 메소드 없는데
		// 참조하려고 할떄.
		
//		String str = null;
//		str.split(str);
		
		
		try {
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("합계 " + (num + num1));
		} catch (InputMismatchException e) {
			//try 던져서 InputMismatchException 처리하는 작업.
			
			System.out.println("정수만 입력 해!!!");
		}

		
		
	}
}
