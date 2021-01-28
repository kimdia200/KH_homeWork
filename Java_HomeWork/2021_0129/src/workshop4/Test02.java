package workshop4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("기본문제");
		int[] arr3 = new int[5];
		
		//값대입
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*10)+1;
		}
		
		//값출력
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
			if(i!=arr3.length-1)
				System.out.print(" ");
		}
		
		int sum=0;
		int count=0;
		
		for (int i = 0; i < arr3.length; i++) {
			sum+=arr3[i];
			count++;
		}
		
		System.out.println("\nsum="+sum);
		System.out.println("avg="+(double)sum/count);
		
		
		System.out.println("\nOption : 랜덤한 숫자의 중복 허용을 하지 않게 배열에 입력 한다.");
		Set<Integer> set = new HashSet<Integer>();
		//값대입
		while(set.size()!=5) {
			set.add((int)(Math.random()*10)+1);
		}
		
		//값출력
		sum=0;
		count=0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.print(i);
			if(it.hasNext())
				System.out.print(" ");
			sum+=i;
			count++;
		}
		System.out.println("\nsum="+sum);
		System.out.println("avg="+(double)sum/count);
		
	}
}
