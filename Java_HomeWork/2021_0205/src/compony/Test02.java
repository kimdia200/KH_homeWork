package compony;

public class Test02 {
	public static void main(String[] args) {
		Compony c = new Compony(Integer.parseInt(args[0]));
		
		System.out.print("연 기본급 합 : "+c.getIncome());
		System.out.println(" 세후 : "+c.getAfterTaxIncome());
		
		System.out.print("연 보너스 합 : "+c.getBonus());
		System.out.println(" 세후 : "+c.getAfterTaxBonus());
		
		System.out.println("연 지급액 합 : "+c.getTotal());
	}
}
