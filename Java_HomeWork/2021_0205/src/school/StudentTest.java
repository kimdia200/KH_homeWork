package school;

public class StudentTest {
	public static void main(String[] args) {
		Student studentArray [] = new Student[3];

		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		double ageSum=0;
		double hSum=0;
		double wSum=0;
		System.out.println("이름      나이      신장      몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].getName()+"  "+
					studentArray[i].getAge()+"    "+
					studentArray[i].getHeight()+"    "+
					studentArray[i].getWeight()
					);
			ageSum+=studentArray[i].getAge();
			hSum += studentArray[i].getHeight();
			wSum += studentArray[i].getWeight();
		}
		System.out.printf("나이의 평균 : %.2f\n", ageSum/studentArray.length);
		System.out.printf("신장의 평균 : %.2f\n", hSum/studentArray.length);
		System.out.printf("몸무게의 평균 : %.2f\n", wSum/studentArray.length);
	}
}
