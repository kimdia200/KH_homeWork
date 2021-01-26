package _2;

public class Example02 {

    static int getVowelCount(String s) {
    	int count = 0;
    	for(int i=0; i<s.length(); i++) {
    		switch(s.toLowerCase().charAt(i)) {
    		case 'a' : count++; break;
    		case 'e' : count++; break;
    		case 'i' : count++; break;
    		case 'o' : count++; break;
    		case 'u' : count++; break;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
        for (String s : a) {
            int count = getVowelCount(s);
            System.out.printf("%s %d\n", s, count);
        }
    }
}
