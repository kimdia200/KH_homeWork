package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exam06 {

	static void intersection(Collection<String> c1, Collection<String> c2) {
		// abcd
		Collection<String> temp = new ArrayList<>(c1);

		temp.retainAll(c2);
		c1.removeAll(c1);
		c1.addAll(temp);
	}

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		Collection<String> c2 = new ArrayList<String>();
		c1.addAll(Arrays.asList("a", "b", "c", "d"));
		c2.addAll(Arrays.asList("b", "d", "e", "f"));

		intersection(c1, c2);
		System.out.println(c1.toString());
	}
}
