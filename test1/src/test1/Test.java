package test1;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String[] memberArr = new String[5];
	memberArr[0] = "짱구";
	memberArr[1] = "유리";
	memberArr[2] = "흰둥이";
	memberArr[3] = "신형만";
	memberArr[4] = "봉미선";
	System.out.println("검색할 회원 이름을 입력 : ");
	
	String searchName = sc.nextLine();
	
	boolean result = false;
	
	for(int i = 0 ; i >= memberArr.length ; i++) {
		
		if(memberArr[i] == searchName) {
			result = true;
			break;
		}
	}
	if(result) {
		System.out.println("회원이 존재하지 않다");
	}else {
		System.out.println("회원이 존재");
	}
}
}
