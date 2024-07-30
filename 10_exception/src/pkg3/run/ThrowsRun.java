package pkg3.run;

import java.io.IOException;

import pkg3.service.ThrowsService;

public class ThrowsRun {

	public static void main(String[] args) throws IOException {
		ThrowsService service = new ThrowsService();
		
		
//		service.test1();
		
		//빨간줄이 뜨는 이유
		// -> test3() 에서 IOException이 던져져 올수도 있기 떄문에 
		// 대비 (예의 처리)를 해야하는데안해서
		//-> main() 메서드에 throws를 작성해서 또 예외를 전달
		//하지만 . Main()을 호출한 메서드는 존재하지 않기 떄문에
		// "예외가 처리되지 않아" 프래그램이 강제정
//		service.test3();
		service.test5();
	System.out.println("와아아악");	
	}
}
