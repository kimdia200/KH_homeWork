package member.model.vo;

public class Vip extends Member {

	public Vip() {
		super();
	}

	public Vip(String name, String grade, double point) {
		super(name, grade, point);
	}

	@Override
	public double getBonusPoint() {
		return super.getPoint()*0.1;
	}
}
