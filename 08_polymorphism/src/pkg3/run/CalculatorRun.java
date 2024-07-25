package pkg3.run;

import pkg3.dto.Calculator;
import pkg3.dto.KSMCalculator;

public class CalculatorRun {

	public static void main(String[] args) {
		
		//인터페이스도 추상클래스 처럼
		//- 객체 생성 X
		//- 부모 타입 참조 변수로 사용 가능 O
		// -> 다형성 업캐스팅 + 동적 바인딩 
		
		Calculator c = new KSMCalculator();
		
		System.out.println(c.plus(900000000, 300000000));
		System.out.println(c.minus(1, 30));
		System.out.println(c.multi(54, 43));
		System.out.println(c.div(2323, 45));
		System.out.println(c.mod(1234, 5));
		System.out.println(c.pow(5, 20));
		System.out.println(c.arear0fCircle(5.8));
		System.out.println(c.toBinary(100));
		System.out.println(c.toHexadecimal(100));
		
		// 객체 배열
		
		
		
		
		
		
	}
}
