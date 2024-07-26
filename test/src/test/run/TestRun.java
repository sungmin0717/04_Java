package test.run;

import java.util.Scanner;

public class TestRun {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String[] memberArr = {"봉미선","신형만","짱구","철수","흰둥이"};
		
		
		System.out.println("검색할 회원 이름 입력 : ");
		String searchName = sc.next();
		
		boolean result = false;
		
		for(int i = 0 ; i < memberArr.length ; i++) {
			if(memberArr[i] .equals (searchName)) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println("회원이 존재 합니다.");
			
		}else {
			System.out.println("회원이 존재하지 않습니다");
		}
	}
}
