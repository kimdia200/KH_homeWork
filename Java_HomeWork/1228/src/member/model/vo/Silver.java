package member.model.vo;

public class Silver extends Member {

	public Silver() {
		super();
	}

	public Silver(String name, String grade, double point) {
		super(name, grade, point);
	}
	@Override
	public double getBonusPoint() {
		return super.getPoint()*0.02;
	}
}
