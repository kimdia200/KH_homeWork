package workshop4;

public class Test05 {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int sum=0;
		
		for(int i=num; i<=10; i++) {
			if(i%3!=0 && i%5!=0) {
				if(sum==0)
					System.out.print(i+"+");
				else
					System.out.print(i);
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("결과 : "+sum);
	}
}
