package view;

public class MemberView {

	
	public void mainMenu() {
		
		int input = 0;
			
		
		switch(input) { 
		case 1: sigup(); break;
		case 2: seletAll(); break;
		case 3: searchName();  break;
		case 4: pointSand break;
		case 5: profileFixd break;
		case 6: giveUp break;
			
		case 0: 
			System.out.println(" 프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("잘못입력되었습니다.");
			break;
			
		}
	}
}
