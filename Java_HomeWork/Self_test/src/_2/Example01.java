package _2;

public class Example01 {

    public static void main(String[] args) {
        int[] a1 = new int[] { 345, 12, 478, 1003 };
        double[] a2 = new double[] { 23.24, 301.234, 3.1235, 98.0238 };
        String[] a3 = new String[] { "one", "two", "three", "four" };

        System.out.println("       int     double     String");
        System.out.println("---------- ---------- ----------");
        for (int i = 0; i < a1.length; ++i) {
        	System.out.printf("%10d %10.3f %10s\n",a1[i],a2[i],a3[i]);
        }
    }
}
