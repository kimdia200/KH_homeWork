package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam14 {

    static void sort(int[] a) {
    	Arrays.sort(a);
    }

    static boolean contains(int[] a, int value) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<a.length; i++) {
    		list.add(a[i]);
    	}
    	return list.contains(value);
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(contains(a, 2));
        System.out.println(contains(a, 6));
    }
}

