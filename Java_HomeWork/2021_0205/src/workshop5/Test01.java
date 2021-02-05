package workshop5;


public class Test01 {
	public static void main(String[] args) {
		
		char[] arr = args[0].toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
