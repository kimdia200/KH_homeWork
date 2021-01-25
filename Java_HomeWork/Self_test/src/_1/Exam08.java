package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exam08 {

    static Collection<String> intersection(Collection<String> c1, Collection<String> c2) {
    	Collection<String> list = new ArrayList<String>();
    	list.addAll(c1);
    	list.retainAll(c2);
    	
    	return list;
    }

    public static void main(String[] args) {
        Collection<String> c1 = Arrays.asList("a", "b", "c", "d");
        Collection<String> c2 = Arrays.asList("b", "d", "e", "f");
        Collection<String> c3 = intersection(c1, c2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
