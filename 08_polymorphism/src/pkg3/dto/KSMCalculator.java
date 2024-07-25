package pkg3.dto;

//인터페이스 상속 키워드 : implements (구현하다)

public class KSMCalculator implements Calculator{
	
	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		int result = a - b;
		return 0;
	}
	@Override
	public int multi(int a, int b) {
		int result = a * b;
		return 0;
	}
	@Override
	public int div(int a, int b) {
		int result = a / b;
		return 0;
	}
	@Override
	public int mod(int a, int b) {
		int result = a % b;
		return 0;
	}
	@Override
	public int pow(int a, int x) {
		int result = 1;
		for(int i = 0 ; i < x ; i++) {
			result *= a;
		}
		return 0;
	}
	@Override
	public double arear0fCircle(double r) {
		return Calculator.PI * r * r; 
	}

	public String toBinary(int num) {
		return "이진수이겠지 뭐";
	}
	@Override
	public String toHexadecimal(int num) {
		return "16진수겠지.";
	}



	
	
}
