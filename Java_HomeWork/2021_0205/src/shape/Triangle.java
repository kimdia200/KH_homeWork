package shape;

public class Triangle extends Shape implements Resize{

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public double getArea() {
		return super.getHeight()*super.getWidth()/2;
	}

	@Override
	public void setResize(int size) {
		super.setHeight(super.getHeight()+size);
	}
	
}
