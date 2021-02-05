package shape;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	@Override
	public double getArea() {
		return super.getHeight()*super.getWidth();
	}
	@Override
	public void setResize(int size) {
		super.setWidth(super.getWidth()+size);
	}
}
