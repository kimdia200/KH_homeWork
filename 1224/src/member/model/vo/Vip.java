package member.model.vo;

public class Vip extends Member {

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String name, String grade, double point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonusPoint() {
		return super.getPoint()*0.1;
	}
}
