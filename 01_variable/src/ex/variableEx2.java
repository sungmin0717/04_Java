package ex;

public class variableEx2 {

	public static void main (String[] args) {
		
		/* == 컴퓨터 값 처리 원칙--
		 * 
		 * - 같은 자료형 끼리만 연산이 가능하고 
		 * 결과도 같은 자료형만 반환된다
		 * 
		 * ---- 형변환(casting) ----
		 * - 데이터의 자료형을 변환
		 * 
		 * ====자동 형변환----
		 * - 값의 범위가 서로다른 값들의 연산 시 
		 * 컴파일러가 자동으로 범위가
		 * 작은 값을 큰 값의 자료형으로 변환
		 * */
		//자동 형변환 예시
		System.out.println("[자동 영변환 예시]");
		
		int num1a = 12;
		double num1b = 1.3;
		
		// 1) 다른 자료형 끼리연산
		// 12 + 1.3 => 12.0 + 1.3 +> 13
		System.out.println(num1a + num1b);
		
		//2) 같은 자료형 끼리 연산
		int num2a= 4;
		int num2b = 2;
		
		// (int)3 / i(int) => (double)1.5 -> (int)1
		System.out.println(num2a/num2b); // 3/2 ==
		
		// 3) 여러 자료형 연산
		int num3a = 999;
		long num3b = 10000000000L;
		
//		999+10000000000
		// 999L + 100000000 = 100000000 (long)
		// double result3 = 100000000
		
		// double result3 = 100000999.0
		double result3 = num3a + num3b;
		System.out.println(result3); // 100000000 (부동 소수점)
		
//		 -----------------------------------------------------------------
		/*[자동 형변환이 되지 않는 경우]
		 * 
		 * 값의 범위가 더 큰 자료형을 
		 * 값의 범위가 더 작은 변수에 대입 불가
		 * 
		 * -> 억지로 대입할려면 "강제 형변환"을 이용
		 * */
		
		int a = 100;
		double b = 23.4;
		
//		int result = a + b; // a + b = 100.0 + 123.4 (double)
		
	}
}
