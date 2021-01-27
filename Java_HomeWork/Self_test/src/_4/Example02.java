package _4;

public class Example02 {
    
    static String toString(String[] a) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("{");
    	for (int i = 0; i < a.length; i++) {
			sb.append("\"");
			sb.append(a[i]);
			sb.append("\"");
			if(!(i==a.length-1))
				sb.append(", ");
		}
    	sb.append("}");
    	return sb.toString();
    }
    
    public static void main(String[] args) {
        String[] a = { "one", "two", "three", "four" };
        String s = toString(a);
        System.out.println(s);
    }

}
