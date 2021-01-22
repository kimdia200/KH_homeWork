package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Eagle();
		Flyable b = new Eagle();
		Eagle c = new Eagle();
		
		a.attack();
//		a.fly("하늘"); //Animal 클래스는 fly메서드가 없음
		System.out.println("=========================");
		
//		b.attack(); //Flyable 인터페이스는 attack메서드가 없음
		b.fly("하늘");
		System.out.println("=========================");
		
		c.attack();
		c.fly("하늘");
		//둘다가능~
	}

}
