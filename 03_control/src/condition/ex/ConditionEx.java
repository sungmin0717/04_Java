package condition.ex;

import java.util.Scanner;

public class ConditionEx {

	// 필드 (field) == 멤버 변수 == 인스턴스 변수 (전역 변수 비슷)
	Scanner sc = new Scanner(System.in);

	/*
	 * 조건문 예시 기능 클래스
	 * 
	 */

	/*
	 * 1 ~ 10 난수가 짝수인지 홀수인지
	 */
	public void method1() {

		int ran = (int) (Math.random() * 10 + 1);

		if (ran % 2 != 1) {

			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}

	/*
	 * 나이를 입력받아 13세 이하 : 어린이 14세 이상 19세 이하 : 청소년 20세 이상 : 성인
	 * 
	 * 
	 */
	public void method2() {

		System.out.println("나이 입력 :");
		int age = sc.nextInt(); // 필드 sc 이용

		String result;

		if (age <= 13) {
			result = "어린이";
		} else if (age <= 19) {
			result = "청소년";
		} else
			result = "성인";
		System.out.println(result);
	}

	/*
	 * 나이를 입력받아 13세 이하 : 어린이 14세 이상 19세 이하 : 청소년 -14 ~ 16 청소년(중) 17 ~ 19 청소년(고) 20세
	 * 이상 : 성인
	 * 
	 * 0 이하 또는 100 초과: 잘못 입력 하셨습니다
	 * 
	 */
	public void method3() {
		System.out.println("나이 입력 :");
		int age = sc.nextInt(); // 필드 sc 이용

		String result;

		if (age <= 0 || age > 100)
			result = "잘못된 숫자입니다.";

		else if (age <= 13)
			result = "어린이";

		else if (age <= 16)
			result = "청소년(중)";
//		ex )1
//		else if(age <= 19) { // 청소년
//			result = "청소년" + ((age<=16) ? "(중)" : "(고)"); 

		else if (age <= 19)
			result = "청소년(고)";

		else
			result = "성인";

		System.out.println(result);
	}

	/*
	 * [swich 를 이용한 메서드 호출]
	 * 
	 */

	public void displayMenu() {
//		System.out.println("1.method()");
//		System.out.println("2.method() - 나이구분1");
//		System.out.println("3.method() - 나이구분2");
//		System.out.println("4.method() - 계절찾기");

//		System.out.print("번호 선택 >>");
		int num = sc.nextInt();
		System.out.println("------------------------------------------");
		switch (num) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}

	}

	/*
	 * [switch] 입력된 달(월)의 계절 출력하기
	 */
	public void method4() {
		System.out.print("달(월) 입력 :");
		int month = sc.nextInt();

		String result;
		switch (month) {

		case 3:
		case 4:
		case 5:
			result = "봄";
			break;

		case 6:
		case 7:
		case 8:
			result = "여름";
			break;

		case 9, 10, 11:
			result = "가을";
			break;

		case 12, 1, 2:
			result = "겨울";
			break;

		default:
			result = "잘못 입력";

		}// swuth end

		System.out.println(result);

	}

	/*
	 * [성적 판별기]
	 * 
	 * 중간고사 기말고사, 과제 저수를 입력받아 성적을 부여 -중간고사 40%, 기말고사 50%, 과제 10% -입력시 각각 100점 만점으로
	 * 입력 받음
	 * 
	 * 95점 이상 : A+ 90점 이상 : A 85점 이상 : B+ 80점 이상 : B 75점 이상 : C+ 70점 이상 : C 65점 이상 :
	 * D+ 60점 이상 : D 나머지 : F
	 * 
	 * 
	 * 
	 * [실행화면] 이름 : 홍길동 중간고사 (40%) : 100 기말고사 (50%) : 80 과제 점수(10%) : 50
	 * 
	 * 
	 * 최종점수 : 85점 성적 : B+
	 * 
	 * *
	 */
	public void method5() {

		System.out.println("이름을 입력해주세요 :");
		String name = sc.next();

		System.out.println("중간고사 점수 입력 :");
		int mid = sc.nextInt();
//					중간고사 (40%)

		System.out.println("기말고사 점수 입력 :");
		int last = sc.nextInt();
//			기말고사 (50%) : 80

		System.out.println("과제 점수 입력 :");
		int study = sc.nextInt();
//			과제 점수(10%) : 50

		// 점수 합계
		double sum = (mid * 0.4 + last * 0.5 + study * 0.1);
		String result;

		if (sum < 70)
			result = ((mid <= 65) ? "D" : "D+");

		else if (sum < 80)
			result = ((mid <= 75) ? "C" : "C+");

		else if (sum < 90)
			result = ((mid <= 85) ? "B" : "B+");

		else if (sum <= 100)
			result = ((mid <= 95) ? "A" : "A+");

		else
			result = "F";
		System.out.println();
		System.out.println(name + "의 최종 점수 :" + sum + "점");
		System.out.println("성적 : " + result);

//			 * 이름 	  	    : 홍길동
//			 * 중간고사 (40%) : 100
//			 * 기말고사 (50%) : 80
//			 * 과제 점수(10%) : 50
//			 * 
//			 * 
//			 * 최종점수 : 85점
//			 * 성적    : B+
//			 * 

		/**
		 * [연습 문제] 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아 40점 미만 과목이 있으면 FAIL 평균이 60점 미만인 경우도 FAIL
		 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
		 * 
		 * [출력 예시] 점수 입력(국 영 수 사 과) : 100 50 60 70 80
		 * 
		 * 
		 * 1) 40점 미만 과목이 존재하는 경우 FAIL [40점 미만 과목 : 국어 영어]
		 * 
		 * 
		 * 2) 평균 60점 미만인 경우 FAIL [점수 : 50.4 (평균 미달)] !!!!!!!!!!!!!
		 * 
		 * 
		 * 3) PASS인 경우 PASS [점수 : 83.4 / 100]
		 */

	}

	public void practice() {
		
		System.out.println("국어 성적 입력 :");
		int kor = sc.nextInt();
		System.out.println("영어 성적 입력 :");
		int eng = sc.nextInt();
		System.out.println("수학 성적 입력 :");
		int mat = sc.nextInt();
		System.out.println("사회 성적 입력 :");
		int soc = sc.nextInt();
		System.out.println("과학 성적 입력 :");
		int sci = sc.nextInt();
		
		if(kor < 60);
		
		
		double num = 
(kor * 0.2 + eng * 0.2 + mat * 0.2 + soc * 0.2 + sci * 0.2);
		
		String result;
		if(num < 60) result = "pass";
		else if (num > 100) result = "다시 입력해주세요";
		else result = "합격";
		
		System.out.println(result);
		
		
		
		
		
		
		String fall;
		
		if (kor < 40)
			fall = ((kor <= 40) ? "FALL" : "PASS");
		else if (eng < 40)
			fall = ((eng <= 40) ? "FALL" : "PASS");
		else if (mat < 40)
			fall = ((eng <= 40) ? "FALL" : "PASS");
		else if (soc < 40)
			fall = ((eng <= 40) ? "FALL" : "PASS");
		else if (sci < 40)
			fall = ((eng <= 40) ? "FALL" : "PASS");
		else fall = "다시 입력.";
//		fall pass 구분기
		
			
		System.out.println(fall);
		

		

		
 		System.out.printf("국어:"+ kor, fall);
 		System.out.println("영어"+eng, fall);
 		System.out.println("수학"+mat, fall);
 		System.out.println("사회"+soc, fall);
 		System.out.println("과학"+sci, fall);
	}

}
