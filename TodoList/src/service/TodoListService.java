package service;

import java.time.LocalDateTime;
import java.util.Map;

public interface TodoListService {

	/**
	 * 할 일 목록 반환 서비스
	 * @return TodoList + 완료 개수.
	 */
	public abstract Map<String, Object> TodoListFullView();

	
	/** 날짜 포맷을 변환해서 반환
	 * 
	 * @param regDate
	 * @return yyyy-MM-dd HH:mm:ss 형태 날짜 반환
	 */
	public abstract String dateFormat(LocalDateTime regDate);

}
