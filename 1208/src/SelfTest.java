
public class SelfTest {

	public static void main(String[] args) {
		SelfTest t1 = new SelfTest();
		t1.test1();
	}
	
	/**
	 * ��ü���� ���� ��
	 */
	public void test1() {
		int a = 1;
		int b = 2;
		int c;
		
		boolean d;
		
		c = a++ + --b;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		d = a-- == b++;
		System.out.println(d == true ? "True!!!" : "False!!!");
		System.out.println("a = " + a + ", b = " + b);
	}
}
