package pkg4.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 문자 기반 스트림
 * 
 * - 2byte 문자(char) 단위로 입/출력하는 스트림
 * 
 * - 문자만 작성된 파일(txt), 채팅, 
 *  인터넷 요청(주소) / 응답 (html)
 * 
 */

public class CharService {

	/**
	 * 문자 기반 스트림을 이용해 출력하기1 - 기반 스트림만 이용.
	 */

	public void fileOutput1() {
		// StringBuilder : String 불변성을 해결한 객체.
		StringBuilder sb = new StringBuilder();
		sb.append("오늘은 8월 1일 입니다\n");
		sb.append("아쉽게도 목요일이네요");
		sb.append("아벌써 배고픔");
		sb.append("Hello world");
		sb.append(123456);

		String str = sb.toString();

		// 문자 기반 스트림 참조 변수 선언.
		FileWriter fw = null;

		try {
			// 예외가 발생할 것 같은 구문 작성.

			File folder = new File("/11_ioTest/char");
			if (!folder.exists()) {
				folder.mkdirs();
			}
			// 문자 기반 스트림 객체 생성.
			fw = new FileWriter("\\11_ioTest\\char\\문자테스트.txt");

			// 문자열을 지정된 파일에 출력
			// -> 자동으로 전달한 String을 한 글자씩 출력.

			fw.write(str);

			// 스트림 밖으로 데이터를 흘려보냄 (flush)
			fw.flush();
			System.out.println("[출력완료]");

		} catch (Exception e) {
			// try에서 던져진 예외를 잡아서 처리하는 구문

			e.printStackTrace();
		} finally {
			// try에서 예외 발생 여부 관계 없이 무조건 수행하는 구문.

			try {
				// close() : flush() 후 스트림 닫
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 문자 기반 스트림을 이용해 출력하기2 - 기반 + 보조 스트림.
	 */

	public void fileOutput2() {
		StringBuilder sb = new StringBuilder();
		sb.append("문자 기반 보조 스트림");
		sb.append("BufferdWriter를 이용해");
		sb.append("출력한 결과 입니다.");

		String str = sb.toString();

		// 스트림 참조 변수 선언.

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			// 스트림 객체 생성

			fw = new FileWriter("/11_ioTest/char/보조스트림출력.txt");
			bw = new BufferedWriter(fw); // 보조 스트림.
			bw.write(str); // 보조스트림을 이용해 출력.

			bw.flush(); // 출력 . 안전하게 명확하게 하고싶다면, bw.flush문구 추가.

			System.out.println("출력완료.");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// 보조 스트림을 닫으면 기반 스트림도 같이 닫힘.
			// - close() 호출 시 자동으로 flush()도 호출됨 출력도됌.
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 문자 기반 입력 스트림을 이용해 /11_ioTest/char/문자테스트.txt 파일 내용을 읽어와 콘솔에. 출력해라.
	 */
	public void fileInput1() {

		FileReader fr = null;

		try {
			fr = new FileReader("/11_ioTest/char/문자테스트.txt");
			
			int value = 0; //0일떄 읽을게 없다면 -1이 된다.

			StringBuilder sb= new StringBuilder();
			
			while(true) {
				//fr.read() : 문자 하나 (2byte)를 읽어옴, 없으면 -1
				value = fr.read();
				//더이상 읽어올 문자가 없을경우
				if (value == -1) break;
				
				sb.append((char)value);
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			

	}
	/**
	 * 문자 기반 스트림을 이용해 입력 받기2
	 * -기반 + 보조스트림.
	 */
	
	public void fileInput2() {
		//스트림 참조 변수 선언.
		FileReader fr = null;
		//보조스트림.
		BufferedReader br = null;
		
		
		try {
			//스트림 객체 생성.
			fr = new FileReader("/11_ioTest/char/문자테스트.txt");
			//기반스트림을 넣어준다.
			br = new BufferedReader(fr);
			
//			br.readLine()
			// 한줄을 읽어오는것 반환형 타입은 (String)
			// -> \n은 읽어오지 않음.
			String line = null; // 읽어온 한 줄을 저장할 변수
			StringBuilder sb = new StringBuilder(); //스티링 변환.
			while(true) {
				line = br.readLine();
				
				//읽어온 내용이 없다면 반복 종료.
				if(line == null) break;
				
				sb.append(line); // 읽어온 내영 누적
				sb.append("\n");
			}
			
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}finally {
			try {
			if(br != null)	br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}

