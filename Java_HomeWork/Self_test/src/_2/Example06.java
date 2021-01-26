package _2;

public class Example06 {
	static String[] split1(String s) {
		String[] temp = s.split("[,]");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i].replaceAll("[ ]", "");
		}
		return temp;
	}

	static String[] split2(String s) {
		String[] temp = s.split("[,]");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i].toUpperCase().trim();
		}
		return temp;
	}

	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five";
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t);
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	}
}