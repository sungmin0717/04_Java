package basic;

public class AccountRun {

	public static void main(String[] args) {

		// Account 객체 생성
		Account a1 = new Account();
		// The field Account.name is not visible
		// -> 캡슐화(private)로 인해 변수가 보이지 않아 오류
//		a1.name = "홍길동";
//		a1.accountNumber = "1234567890";
//		a1.balance = 10000;
//		a1.Password = "qwer1234";

		// 간접 접근 기능을 이용해 세팅
		a1.setName("홍길동");
		a1.setAccountNumber("1234567890");
		a1.setBalance(10000);
		a1.setPassword("qwer1234");

//		//a1 계좌의 잔액, 비밀번호바꾸기
// 		System.out.println("a1 잔액 :"+a1.balance); 
//		
//		a1.balance = 0; //잔액을 0원으로 바꿔버림
//		a1.Password = "asdf1234";

		// 간접 기능을 이용해 값 얻어오기
		String name1 = a1.getName();
		String accountNumber1 = a1.getAccountNumber();
		long getBalance1 = a1.getBalance();
		String password1 = a1.getPassword();

		System.out.printf("%s / %s / %d / %s \n",
				name1, accountNumber1, getBalance1, password1);
		
		
		//입금 기능 호출
		a1.deposit(5000); // a1이 참조하는 계좌의 잔액을 5000원 추가
		
		String a = "ABCD";
		String b = new String("ABCD");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); // false(동일비교) 값만똑같은 일치냐
		System.out.println(a.equals(b)); // true(동등비교) 값이 일치하냐
		System.out.println("-------------------------------------------");
		System.out.println("[출금기능]");
		
		a1.withdraw("1234567", 200000); // 비밀번호 불일치
		a1.withdraw("qwer1234", 200000); // 잔액부족
		a1.withdraw("qwer1234", 6000); // 출금성공
		a1.withdraw("qwer1234", 9000); // 모두 출금
	}
}
