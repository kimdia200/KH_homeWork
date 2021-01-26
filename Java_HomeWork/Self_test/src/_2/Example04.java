package _2;

public class Example04 {

    static String removeO(String s) {
//    	방법1
//    	char[] temp = s.toCharArray();
//    	StringBuilder sb = new StringBuilder();
//    	for(int i=0; i<temp.length; i++) {
//    		if(temp[i] == 'o' || temp[i] == 'O')
//    			continue;
//    		sb.append(temp[i]);
//    	}
//    	return sb.toString();
    	
//    	방법2
//    	String temp = s.toString();
//    	return temp.replaceAll("o", "").replaceAll("O", "");
    	
    	
//    	방법3
    	String temp="";
    	for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='o' || s.charAt(i)=='O')
				continue;
			temp+=s.charAt(i);
		}
    	return temp;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    }
}