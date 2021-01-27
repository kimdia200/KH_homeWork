package _4;

public class Example01 {
    
    static String reverse(String s) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(s);
    	sb.reverse();
    	return sb.toString();
    }
    
    public static void main(String[] args) {
        String s = "hello world";
        s = reverse(s);
        System.out.println(s);
    }

}
