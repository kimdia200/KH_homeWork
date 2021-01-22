package member.model.vo;

public class Gold extends Member{

	public Gold() {
		super();
	}

	public Gold(String name, String grade, double point) {
		super(name, grade, point);
	}

	@Override
	public double getBonusPoint() {
		return super.getPoint()*0.05;
	}
}
