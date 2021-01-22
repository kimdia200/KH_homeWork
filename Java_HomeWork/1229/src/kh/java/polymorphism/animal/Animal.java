package kh.java.polymorphism.animal;

public abstract class Animal {
	public void say() {
		System.out.println("안녕하세요, 저는 동물입니다.");
	}
	public Animal() {
		super();
	}
	public abstract void attack();
}
