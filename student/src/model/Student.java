package model;

import test.Test;

public class Student {

	private String name;
	private int score;
	
	void Student(String name, int score){
		
	}
		



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static int length() {
		return 0;
	}
	
}
