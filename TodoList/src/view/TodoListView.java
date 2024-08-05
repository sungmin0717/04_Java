package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import dto.Todo;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

	private TodoListService service = null;
	private BufferedReader br = null;

	// 기본생성자
	public TodoListView() {

		try {
			service = new TodoListServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));

			// 기본 생성자를 만들면서 버퍼리더에게 값을 대입해줘서 널에서 변경되었따.
		} catch (Exception e) {
			System.out.println("*** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}

	}

	public void mainMenu() {
		int input = 0;
		do {
			try {

				input = showMenu();
				switch (input) {
				case 1:
					TodoListFullView();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;

				case 0:
					System.out.println("프로그램 종료");
					break;

				default:
					System.out.println("메뉴에 작성된 번호만 입력해줘");
				}

				System.out.println("===================================");
			} catch (NumberFormatException e) {
				System.out.println("----숫자만 입력해주세요-----");
			} catch (IOException e) {
				System.err.println("### 입/출력 관련 예외 발생 ###");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (input != 0);

	}

	// -------------------------------------------------------

	public int showMenu() throws NumberFormatException, IOException {
		System.out.println("+-----------------MENU-------------------+");
		System.out.println();
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");

		System.out.println("select menu number >>>");
		int input = Integer.parseInt(br.readLine());
		System.out.println();

		return input;
	}

	// ------------------------------------
	private void TodoListFullView() {
		System.out.println("============= [1. Todo List Full View] =============");

		// 할 일 목록, 완료 개수
		Map<String, Object> map = service.TodoListFullView();

		List<Todo> TodoList = (List<Todo>) map.get("TodoList");
		int complateCount = (int) map.get("complateCount");

		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n", complateCount, TodoList.size());

		System.out.println("-------------------------------------------");
		System.out.printf("%-3s %10s %10s %s\n ", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("-------------------------------------------");

		for (int i = 0, len = TodoList.size(); i < len; i++) {
			String title = TodoList.get(i).getTitle();
			String completeYN = TodoList.get(i).isComplete() ? "O" : "X";
			String regDate = service.dateFormat(TodoList.get(i).getRegDate());
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}
	}
}
