package _3;

public class Example02 {

    static int[][] create2DArray(int row, int col) {
        int[][] a = new int[row][col];
        for (int r = 0; r < row; ++r)
            a[r] = new int[col];
        return a;
    }

    static void fill2DArray(int[][] a) {
        int count = 0;
        for (int r = 0; r < a.length; ++r)
            for (int c = 0; c < a[r].length; ++c)
                a[r][c] = count++;
    }

    static void print2DArray(int[][] a) {
    	for (int i = 0; i < a.length; i++) {
    		System.out.print("[ ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%02d ",a[i][j]);
			}
			System.out.println("]");
		}
    }

    public static void main(String[] args) {
        int[][] a = create2DArray(4, 3);
        fill2DArray(a);
        print2DArray(a);
    }
}
