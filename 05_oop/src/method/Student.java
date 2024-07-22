package method;

// class : 객체(속성, 기능)를 정의하는 문서 (== 설계도) 
public class Student {

	
	// 필드 = (==멤버 변수)
	
	
	// 필드 1 - class변수 (==static 변수)
	public static String schoolName = "Kh대학교";
	
	//사용하려면 클래스 이름을 붙여야함 Student.school.Name
	// -> 클래스명.변수명 형태로 호출하기 떄문에 class 변수이다.
	
	public static final int MIN_VALUE = 0; // 스킬 역량 최소값.
	public static final int MAX_VALUE = 100; // 스킬 역량 최소값.
	
	// 필드2 - instance 변수
	
	// 이름 선언이다.
	private String name; 			//이름
	private String studentNumber;	// 학번
	private char gender;			// 성별
	private int java;				// 자바 역량 점수
	private int html;  				// html 역량 점수
	//-> new 연산자에 의해서 생성된 객체 (instance 의 변수)
	
	
	
	//생성자
	
	// - new  연산자에 의해 객체 생성 시 실행되는 메서드다 (== 기능)
	
	public Student() {}// 기본 생성자 
	
	//(오버로딩 적용)
	//매개변수 생성자
	public Student(String name, String studentNumber, char gender) {//
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender= gender;
	}
	
	
	
	
	
	// 메서드 == 멤버 메서드)
	
	
	
	
	
	
	
	
	/*(getter/setter)*/
	
		/*반환형 : 메서드 호출  시 반환되는 값의 자료형*/
	public String getName() {
		return name;
	}
			/*매개 변수 : 메서드 호출시 전달된 값을 저장하는 변수*/
	public void setName(String name) {
		
		
		this.name = name;
		// this 참조 변수 : 생성된 객체 자체를 참조하는 변수 (이 객체)
		
		
		// 반환형 void : return 옆에 반환할 값이 없다
//		return; // -> 미작성시 컴파일러가 자동추가를 해준다
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	// getter/setter 자동완성 : alt + shift + s  ->  r

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	//객체의 필드 값을 문자열로 반환하는 메서드
	public String toString() {
		
		// 240001 / 홍길동 / 남 / java : 80 / html : 70
		
		//String String.format("패턴", 원하는 값)
		// -> 패턴 형태의 문자열을 반환하는 메서드
		// (printf와 비슷한데 printf는 출려,
		// String.format()은 문자열 만들어서 반환)
		
		
		return String.format("%s / %s / %c / java : %d / html :%d",
				studentNumber, name, gender, java, html);
	}
	
	
	
	
	
}

