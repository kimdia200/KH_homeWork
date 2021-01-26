package _2;

public class Example08 {
    
    public static boolean isNullEmptyBlank(String s) {
    	if(s==null)
    		return true;
    	
    	String temp = s.trim();
    	if(temp.length()==0)
    		return true;
    	return false;
    }

    public static void main(String[] args) {
        String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . "};
        
        for (String s : a) 
            System.out.println(isNullEmptyBlank(s));
    }
}
