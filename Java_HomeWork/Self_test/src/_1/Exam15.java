package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam15 {

    static void sort(int[] a) {
    	Arrays.sort(a);
   }

    static int[] insert(int[] a, int value) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int x : a) {
    		if(!(list.contains(x)))
    			list.add(x);
    	}
    	list.add(value);
    	list.sort(null);
    	int[] temp = new int[list.size()];
    	for(int i=0; i<temp.length; i++) {
    		temp[i]=list.get(i);
    	}
    	return temp;
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        a = insert(a, 2);
        a = insert(a, 6);
        System.out.println(Arrays.toString(a));
    }
}
