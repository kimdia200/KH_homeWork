package _1;

import java.util.Arrays;

public class Exam02 {

    static String toString(Person[] a) {
    	
    	return Arrays.toString(a);
    }

    public static void main(String[] args) {
        Person[] a = new Person[] { 
        		new Person("홍길동", 18),
        		new Person("임꺽정", 21)
        		};

        System.out.println(toString(a));
    }
}
