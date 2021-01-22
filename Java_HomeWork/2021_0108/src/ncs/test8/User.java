package ncs.test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	public User() {
		super();
	}
	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof User))
			return false;
		User u = (User)obj;
		if(id.equals(u.id) && 
				password.equals(u.password) &&
				name.equals(u.name) &&
				age==u.age &&
				gender==u.gender &&
				phone.equals(u.phone))
			return true;
		return false;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return id+"  "+password+"  "+name+"  "+gender+"  "+phone;
	}
	
}
