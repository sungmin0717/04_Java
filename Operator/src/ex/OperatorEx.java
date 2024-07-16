package ex;

import java.util.Scanner;

public class OperatorEx {

	/*
	 * 예제 기능용 클래스
	 */

	// OperatorRun에서
	// 호출할 수 있는 기능을 정의해두는 클래스

	// method == 객체(클래스)가지고 있는 기능(function)

//	test1() 메서드  
	public void test1() {
		System.out.println("test1() 메서드 호출됨");

	}

	public void test2() {
		System.out.println("22222222222222222");
	}

	/*
	 * 입력 받은 두 정수의 산술 연산 결과 출력하기
	 * 
	 * 정수 입력 1 : 10 정수 입력 2 : 3
	 * 
	 * 10 + 3 = 13 10 - 3 = 7 10 * 3 = 30 10 / 3 = 3 10 % 3 = 1
	 * 
	 */

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력1 :");
		int num1 = sc.nextInt(); // 입력 버퍼에 있는 다음 정수 읽어오기
									// 정수만 읽어오고 [엔터]는 남음
		System.out.print("정수 입력2 :");
		int num2 = sc.nextInt();

		// \n : 개행 (escape 문자)
		System.out.println(); // 줄바꿈
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
	}
	
	
	/*
	 * 입력 받은 정수가 3의 배수가 맞는지 확인
	 * 
	 * 입력 
	 * */

	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		int input = sc.nextInt();
		
		//input이 3의 배수가 맞으면 true, 아니면 false저장
		
		boolean isTrue = input % 3 == 0;
		
		System.out.printf("%d는 3의 배수인가? %b", input , isTrue );
	}
	
	/*첫번쨰 입력 받은 수가
	 * 두번쨰 입력 받은 수의 배수가 맞는가

	 * 
	 * [true 인경우]
	 * 첫번째 입력 : 20
	 * 두번째 입력 : 5
	 * 20은 5의 배수가 맞는가? true
	 * 
	 * 
	 * [flase 인경우]
	 * 첫번째 입력 : 9
	 * 두번째 입력 : 4
	 * 9은 4의 배수가 맞는가? false
	 * 
	 * */
	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 입력 :");
		int input = sc.nextInt();
		
		System.out.println("두번쨰 입력 :");
		int input2 = sc.nextInt();
		
		boolean isTrue = input % input2 == 0;
		
		System.out.printf("%d은 %d 의 배수가 맞는가? %b", input, input2, isTrue);
		
				/*
		 * 생성된 난수가1 이상 10 이하 짝수가 맞는지 확인
		 * (난수 범위 1 ~20)
		 * 
		 * */
	}
	
	public void method4() {

		int randomNumber = (int)(Math.random() * 20 + 1);
//								0.0 ~ 1.0		20 + 1
		System.out.println("생성된 난수 :" + randomNumber);
		
//		1 이상 10이하가 맞는지 확인하기
		boolean result1 = randomNumber >= 1 && randomNumber <= 10;
//		짝수 확인
		boolean result2 = randomNumber % 2== 0;
		System.out.println("1~10 사이 짝수 맞아?" + (result1 && result2));
			
	}
	/*
	 * 입력 받은 수가 짝수 이거나 
	 * 10보다 큰 수 (초과)인지 확인해봐라
	 * 
	 * */
	
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		
		boolean result1 = (num1 % 2 == 0) || (num1 > 10); 
		System.out.println("result1 :" + result1);
		
		
		/* [삼항 연산자 1 ]
		 * 1 ~ 10 사이 난수 발생 시켜 
		 * 홀/짝 검사
		 * 
		 * 
		 * */
	}
	public void method6(){
//		1부터 10 사이 난수
		int ran = (int)(Math.random() * 10 + 1);
		String result = (ran % 2 == 0) ? "짝수" : "홀수"; 
			
		System.out.printf("%d는 %s", ran, result);
		
	}
	/** [삼항 연산자2]
	 * 나이를 입력 받아
	 * 13세 이하면 "어린이"
	 * 14세 이상 19세 이하 "청소년"
	 * 20세 이상 "성인"
	 * 출력하기
	 * 
	 */
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("나이 입력: ");
		int age = sc.nextInt();		
		
		String result = (age <= 13) ? "어린이" : (age >= 20 ? "성인" : "청소년");
		System.out.println(result);
		
	}
}
