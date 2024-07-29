package map.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.Size2DSyntax;

public class MapService {
	/* Map : 특정 키워드(Key)를 입력하면
	 *       해당되는 상세한 값(Value)를 얻을 수 있는 컬렉션 객체
	 * 
	 * - K:V 형식으로 구성
	 * 
	 * - K:V 한 쌍을 "Entry" 라고 부름
	 * 
	 * - Key : 키워드 역할(== 변수명)
	 * 1) 중복 X
	 *  -> 중복되는 Key 입력 시 Value를 덮어씌움
	 *  -> Key 역할의 객체는 hashCode(), equals() 오버라이딩 필수!
	 *  
	 * 2) 순서 유지 X (단, LinkedHashMap 제외)
	 * 
	 * * Key만 묶어서 보면 Set과 같은 특징을 지니고 있음!
	 *  -> Map.keySet() / Map.EntrySet() 제공
	 * 
	 * 
	 * Value : 키워드에 해당하는 상세한 값
	 * 
	 * - Key로 인해서 모든 Value가 구분됨
	 *  -> Map.get(Key) / Map.remove(Key) 형태로 사용
	 * 
	 */
	
	public void test1() {
		
		// HashMap : 대표적인 Map상속 객체
		// -HASH단어가 붙으면 빠름
		//  -> 대신 Key 역할의 객체가 
		// equals(), hashCode() 오버라이딩 필수!!
		
		//    K       V
		Map<String, String> map = new HashMap<String, String>();
		
		//1. V put(K k , V v) : Map에 K : V 한쌍을 추가
		// 						추가 성공시 Value가 반환됨
		//  -> 중복되는 키가 없으면 null
		// -> 중복되는 key가 있으면 이전 value 반환'ㄴ
		
		System.out.println(map.put("아침","참치 김밥" ));
		System.out.println(map.put("점심","돈까스" ));
		System.out.println(map.put("저녁","삼겹살" ));
		System.out.println(map.put("저녁","꽃등심" ));
		//Key 중복 -> 이전 value를 내보내고 새 value로 대체
		
		System.out.println(map.toString());
		// 2. V get(K k) : 해당 Key에 대응되는 value 반환
		// 단 일치하는 k가업ㄱ=
		
		System.out.println(map.get("아침"));
		System.out.println(map.get("점심"));
		System.out.println(map.get("저녁"));
		System.out.println(map.get("야식"));
		
		System.out.println ("Size() : " + map.size());
		
		//4. V remmove(K k ):
		
		System.out.println(map.remove("아침" + "제거"));
		System.out.println(map.remove("점심" + "점심"));
		System.out.println(map.remove("야식"+  "야식"));
	}
	
	/**
	 * Map의 저장된 모든 요소 순차 접근하가
	 */
	public void test2() {

		//K는 String ->> 문자열만 작성
		//V는 object  > 모든 자료형 가능
		Map<String, Object> student = new HashMap<String, Object>();
		
		//Map을 유사 DTO처럼 사용 
		student.put("name"  , "홍길동"); //String
		student.put("grade" , 3);      //Integer
		student.put("gender", '남');	   //Charater
		student.put("avg"   , 80.4);   //Doubles
		
		
		
		
		/*1) Map.geyse() 이용*/
		
		//-> Key만 모아둔 집합 (Set) 반환
		
		// 모아둔 key 집합에서
		//Map.get(key)를 통해 value를 하나씩 꺼냄
		
		
		Set<String> Keys = student.keySet();		
		System.out.println(Keys);
		
		for(String key : Keys) {
			System.out.printf("student[%s] : %s \n ", key, student.get(key));
		}
		System.out.println("=====================================================");
		/*2) Map.entrySet() 이용*/
		
		// - > K : V 쌍 형태의 객체를 모아둔 집합 (Set) 반환
		Set<Entry <String,Object>> set = student.entrySet();
		
		
		//Entry.getKey()   : key   반환
		//Entry.getValue() : value 반환
		
		
		//향상된 for문
		for (Entry <String,Object> entry :set) {
			System.out.printf("student[%s] : %s \n ", entry.getKey(), entry.getValue());

		}
		
		
	}
	
	
	
}
