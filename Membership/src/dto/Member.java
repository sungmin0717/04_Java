package dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // 컴파일 시 getter 구문을 자동으로 추가
@Setter // 컴파일 시 setter 구문을 자동으로 추가
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor// 전체 필드 매개 변수 생성자
@ToString // toString() 오버라이딩
// lombok 라이브러리 기능.

public class Member implements Serializable{

	//DTO(Data Transfer Object) : 데이터 전달용 객체
	// - 여러 데이터를 한번에 담아서 전달하는 목적
	//  계층간 데이터를 전달하는 목적으로 사용하는 객체
	
	// (계층 : view, service, dao등  다른 클래스)
	
	
	
	//등급을 나타내는 상숭
	public static final int COMMON = 0;
	public static final int GOLD = 1;
	public static final int DIAMOND = 2;
	
	// 회원 정보를 저장할 필드
	private String name;
	private String phone;
	private int amount;
	private int grade;
}
