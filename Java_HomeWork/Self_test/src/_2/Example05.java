package _2;

public class Example05 {

    public static void main(String[] args) {
        String[] a = { " the", "world\t ", " \nwar " };

        for (String s : a) {
        	String temp = s.trim();
            System.out.printf("%s %d\n",temp,temp.length());
        }
    }
}
