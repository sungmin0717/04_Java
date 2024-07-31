package test.otd;

import java.io.File;
import java.io.IOException;

public class TestOtd {

	public void test1() {
		try {
			File f = new File("test.txt");
			if (f.createNewFile()) {
				System.out.println("파일 생성 : " + f.getName());
			} else {
				System.out.println("이미 파일이 존재 합니다.");

			}
		} catch (IOException e) {
			System.out.println("오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}