package test.otd;

public class TestOtd {

	class Animal{
		String name = "동물";
			public void move(){
				System.out.println("움직인다.");
			}
	}
	class Fish extends Animal{
		String name = "물고기";
		public void move() {
			System.out.println("물속에서 헤엄친다.");
		}
	}
	class dog extends Animal{
		String name = "강아지";
		public void move() {
			System.out.println("네발로 뛴다");
		}
	}
	class Eagle extends Animal{
		String name = "독수리";
		public void move() {
			System.out.println("하늘에 훨훨 난다");
		}
	}
}
