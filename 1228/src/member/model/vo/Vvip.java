package member.model.vo;

public class Vvip extends Member {

	
	
	public Vvip() {
		super();
	}

	public Vvip(String name, String grade, double point) {
		super(name, grade, point);
	}

	@Override
	public double getBonusPoint() {
		return super.getPoint()*0.15;
	}
}
