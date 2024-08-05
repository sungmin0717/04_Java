package test;

import java.util.ArrayList;
import model.Student;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = null;
	
		
		
		list.add(new Student("강건강",88));
		list.add(new Student("남나눔",78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
	
//		for(Student i : list) {
		for(int i = 0; i < i list.size(); i++) {
		Student s = list.get(i);
		System.out.println(s);
		
	}
}
}
