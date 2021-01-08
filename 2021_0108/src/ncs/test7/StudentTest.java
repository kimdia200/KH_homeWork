package ncs.test7;

public class StudentTest {
	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("홍길순",25,171,81,"201401","영어영문학");
		s[1] = new Student("한사랑",23,183,72,"201402","건축학");
		s[2] = new Student("임꺽정",26,175,65,"201403","체육학");
		
		for(Student ss : s) {
			System.out.println(ss);
		}
	}
}
