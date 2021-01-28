package workshop4;

public class Test06 {
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("다시 입력하세요");
			return;
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a<0 || a>5 || b<0 || b>5) {
			System.out.println("숫자를 확인하세요");
			return;
		}
		
		//값대입 + sum입력
		double sum=0;
		int count=0;
		int[][] arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*5)+1;
				sum+=arr[i][j];
				count++;
			}
		}
		
		//값출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if(j!=arr[i].length-1)
					System.out.print(" ");
				else
					System.out.println();
			}
		}
		System.out.println("\n");
		
		System.out.println("sum="+sum);
		System.out.printf("avg=%.1f",sum/count);
		System.out.println("avg의 소수점은 1자리수 까지만 표시해줬음");
	}
}
