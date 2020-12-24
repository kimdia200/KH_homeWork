package member.model.vo;

public class Member {
	private String name;
	private String grade;
	private double point;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public Member() {
		
	}
	public Member(String name, String grade, double point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public double getBonusPoint() {
		return 0;
	}
	
}
