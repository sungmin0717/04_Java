package test.otd;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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

	
	
	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = {12, 4, 15, 46, 38, 1, 14};
	        Arrays.sort(num_list);
	        
	        for(int i =0; i <= 46 ; i++) {
	        	answer[i] = num_list[i];
	        }
	        return answer;
	    }
	}



	public void test2() {
		// TODO Auto-generated method stub
		
	}
	}

