package list.service;

import java.util.ArrayList;
import java.util.List;

/* Collection Framework : Java에서 제공하는 자료구조를 모아둔 것
 * (java.util 패키지에 존재)
 * 
 * [특징]
 * 1) 크기 제한 X
 * 2) 추가, 수정, 삭제, 검색, 정렬 등 다양한 기능이 제공됨
 * 3) 객체만 저장 가능!!
 *    (정확히는 객체 참조 주소만 저장 가능)
 * 
 * 
 * [List]
 * - 자료(Data)를 순차적으로 나열한 자료 구조(배열 비슷)
 * 
 * - index가 존재함
 *  -> 각 Data를 index(순서)로 구분할 수 있어
 *     중복된 Data를 저장할 수 있다!!!
 */

public class ListService {

	public void test1() {
		
		// ArrayList 객체 생성
		// -> List 인터페이스를 상속 받은 자식 클래스로
		//    가장 많이 사용하는 List
		
		
		// List : 부모 인터페이스
		//       -> 객체 생성 불가 / 부모 참조 변수 가능
		
//		List list = new ArrayList(); //10칸 
		
		List list = new ArrayList(3); //3칸 
		
		// boolean add(E e)
//		E(Element) : 요소를 뜻하는 상징적인 글자 
//		         (자료형 X, Object 타입)
		
		// - List에 주어진 객체 (e)를 맨 끝에 추가
		

		list.add("아무거나");
		list.add(new Object());
		
		list.add(new int[4]); // 배열도 된다 3번쨰 
		//4번쨰 -> 크기 초과 오류 발생 X
		//     -> List 크기가 자동으로 증가
		
		list.add(123); // int 기본 자료형은 추가 불가
					   // -> Interger Wrapper class로
					   // 변환되어 저장됨
		
		System.out.println(list.toString()); //toString 개체가 가지고있는 필드들을 하나로 갖는다
		
		// 2. void add(int index, E e) 
		// - index 번쨰에 e를 추가 -> 중간에 삽입한다
		
		list.add(2, "중간");
		
		System.out.println(list); //toSting() 생략 가능
		
		
		//3. int size()
		// - 배열에 칸이 아닌, 저장된 Data(객체)의 수를 반환해준다
		
		System.out.println("현재 저장된 data 개수 : " + list.size());
		
		// (E == Object)
		//4 E get(int index)
		//- index번쨰 요소를 반환
		System.out.println(list.get(0));
		
//		List + 일반 for문
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%d 번쨰 인덱스 요소 : %s \n",
					i, list.get(i));
		}
		
		System.out.println("-------------------------------------------");
		
		//List + 향상된 for문
		//              배열명 
		for(Object obj : list) {
			
			String str = null;
			
			//obj가 참조하고있는 객체가 String 이라면
			
			if(obj instanceof String) {
				str = "[String]";
			} else if (obj instanceof int[] ) 	str = "[int[]]";
			else if (obj instanceof int[] ) 	str = "[Integer[]]";
			else 								str = "[Object]";
			
			
			System.out.println(str + obj);
		}
		
		/**
		 * List + 제네릭 (타입 제한) 확인 
		 * + List 메서드 몇 가지 더 
		 */

	}		
	public void test2() {
			
		/*
		 * 제네릭 (Generics <>) 
		 * 
		 * 1) 컬렉션의 타입을 제한하여 
		 * 		한가지 자료형만 저장할수 있게하는 기능
		 * 
		 * 2) 클래스나 메서드가 다룰 타입을 지정하는 기능 
		 */
		
		//String으로 타입이 제한된 List생성
		List<String> menuList = new ArrayList<String>();
		
		//add() 확인
		
//		menuList.add(123);    //String으로 제한되서
							// 다른 자료형 추가 불가능
		
		
		menuList.add("보쌈");
		menuList.add("고기");
		menuList.add("냉면");
		menuList.add("월남쌈");
		menuList.add("불고기");
		menuList.add("떡볶이");
		menuList.add("오뎅");
		
		for(String menu : menuList) {
			System.out.println(menu);
		}
		
		// 5. E set(int index, E e ) 
		// - 지정된 index번쨰 요소를
		// e(두 번째 매개 변수 )로 수정 후 
		// -> 메서드 반환 값을로 이전 객체가 반환된다 
		
		System.out.println("-------------------------------");
		System.out.println(menuList);
		
		String before = menuList.set(2, "소갈비");
		
		System.out.println(before + " 이 " + menuList.get(2) + "로 변경됨");
		System.out.println(menuList);
		
		//6. boolean contains (E e)
		// - List에 내부에 e와 같은 객체가 존재하면 true/false
		// 없으묜 flase 반환 (확인 기능)
		
		System.out.println("보쌈 : " + menuList.contains("보쌈"));
		System.out.println("냉면 : " + menuList.contains("냉면"));
		
		//7. int indexOf(E e)
		// - List에 내부에 e와 같은 객체가
		// 존재하면 해당 index를 반환
		// 존재하지 않으면 -1 반환
		
		
		System.out.println("삼겹살 :" + menuList.indexOf("삼겹살"));
		System.out.println("오뎅 :" + menuList.indexOf("오뎅"));
		
		
		// 8. E remove (int index)
		// - List에서 지정된 index 번쨰 요소를 제거 
		// 	-> 중간이 제거되면 뒤쪽 요소를 앞으로 이동 
		// -제거된 요소는 메서드 결과로 반환됨
		System.out.println("\n" + menuList.remove(0) + "제거");
		System.out.println(menuList);
	}
	
	
	
	
}
