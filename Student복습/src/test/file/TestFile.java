package test.file;

import java.util.Scanner;

public class TestFile {

	Scanner sc = new Scanner(System.in);
	//정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
	
	public void test1() {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num <= 50) {
				System.out.println("*****50 미만의 수 입니다.******");
				
			}else if(num > 50) {
				System.out.println("*****50 이상의 수 입니다.******");
			}else {
				System.out.println("숫자만 입력해주세요");
			}
			
			System.out.println("입력하신 정수는 : " + num);
	}
	
	
	public void test2() {
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		System.out.print("3의 배수인 정수 한개를 입력해주세요 :  \n");
		int num = sc.nextInt();
		if(num % 3 == 0) {
			System.out.println("**3배수 입니다**");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		System.out.printf("입력한 값 :%s", num);

		
	}
	//문제3. 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 

//    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//
//    이를 판단하는 프로그램을 작성해보자.
//
//    점수가 0미만 100초과이면 경고문구 출력!
	
	public void test3() {
		
		System.out.println("학년과점수를 기입해주세요 : ");
		int grade = sc.nextInt();
		int sum = sc.nextInt();
	
		
		
		if(grade != 4) {
			if(0 < sum && 100 > sum) {
				if(sum <= 60) {
					System.out.println("***사람 이신가요?***");
				}else {
					System.out.println("***사람 입니다***");
				}
			}
		}else {
			if(sum >= 70) {
				System.out.println("***합격입니다***");
			}else {
				System.out.println("***불합격 입니다 ***");
			}

		}
		
	}
	
	
}
