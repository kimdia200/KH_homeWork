package _1;

public class Exam10 {

    static int sum(int[][] a) {
    	int sum=0;
    	for(int i=0; i<a.length; i++) {
    		for(int j=0; j<a[i].length; j++) {
    			sum+=a[i][j];
    		}
    	}
    	
    	return sum;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {
            { 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8, 9 }
        };
        System.out.println(sum(a));
    }
}
