package run;

import java.util.HashSet;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("문미미");
		set.add("박보배");
		set.add("송성실");
		set.add("윤예의");
		set.add("정쟂주");

		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
//		String input = sc.nextInt(); 틀린것 1
		String input = sc.next();
		boolean isExist = false;
//		for (int i = 0; i < set.size(); i++) { 
		for (String main : set) {
//			if(name == input) { 틀린것 3
			if (main.equals(input)) {
				System.out.println("존재하는 회원입니다");
				isExist = true;
				return;
				
//			}else {    4 
//			System.out.println("존재하지 않는 회원입니다.");
//			return;
//			}else { 
//			System.out.println("존재하지 않는 회원입니다.");
//			return;
		}
//		if (isExist) {
//			System.out.println("존재하는 회원입니다");

		

//			if (isExist) {
//		System.out.println("존재하지않는 회원입니다");
	}
	if(isExist)	{
		System.out.println("존재하지 않는 회원입니다.");
	}
	}

}
