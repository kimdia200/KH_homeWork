package ncs.test8;

public class UserTest {
	public static void main(String[] args) {
		User[] users = new User[3];
		
		users[0] = new User("user01","pass01","김철수",32,'M',"010-1234-5678");
		users[1] = new User("user02","pass02","이영희",25,'F',"010-5555-7777");
		users[2] = new User("user03","pass03","황진이",20,'F',"010-9874-5632");
		
		System.out.println("users list -------------------------------------------------------------------");
		for(User u : users) {
			System.out.println(u);
		}
		
		System.out.println("copyUsers -------------------------------------------------------------------");
		User[] copyUsers = new User[users.length];
		//굳이 for문으로 참조하라고?...
		for(int i=0; i<copyUsers.length; i++) {
			String id,password,name;
			id = users[i].getId();
			password = users[i].getPassword();
			name = users[i].getName();
			int age = users[i].getAge();
			char gender = users[i].getGender();
			String phone = users[i].getPhone();
			copyUsers[i] = new User(id, password, name, age, gender, phone);
		}
		for(User u : copyUsers) {
			System.out.println(u);
		}
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].equals(copyUsers[i]));
		}
		
	}
}
