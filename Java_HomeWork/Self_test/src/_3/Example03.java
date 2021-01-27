package _3;

import java.util.Arrays;

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	@Override
	public String toString() {
		return name + " " + age;
	}
    
}

public class Example03 {
    
    public static void main(String[] args) {
//        1.1 2.2 3.3
//        "a" "b" "c"
//        Person a, Person b=a ("임꺽정",22)
    	Object[] arr = new Object[3];
    	Person a = new Person("임꺽정", 22);
    	arr[0] = new Double[] {1.1, 2.2, 3.3};
    	arr[1] = new String[] {"a", "b", "c"};
    	arr[2] = new Person[] {a,a};
    	
    	System.out.println(Arrays.deepToString(arr));
    }
}
