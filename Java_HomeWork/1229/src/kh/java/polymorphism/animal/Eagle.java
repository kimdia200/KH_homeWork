package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable{

	
	@Override
	public void attack() {
		System.out.println("독수리킥!");
	}

	@Override
	public void fly(String location) {
		System.out.println(location + "로 독수리가 날아갑니다~!");
	}	
	
}
