package kh.java.inherit.shape;

public class Rectangle extends Shape{
	
	Point[] points = new Point[4];
	private int width;
	private int height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.print("네 꼭지점이 ");
		for(int i=0; i<points.length; i++) {
			System.out.print(points[i].toString());
			System.out.print(i!=points.length-1 ? ", " :"");
		}
		System.out.println("이고, 너비가 "+width+", 높이가 "+height+"인 사각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		return (double)width*height;
	}
	
	@Override
	public String toString() {
		String temp="points=[";
		for(int i=0; i<points.length; i++) {
			temp+=points[i].toString();
			temp+=i!=points.length-1 ? ", " :"";
		}
		temp+="], width="+width+", height="+height;
		
		return temp;
	}
	
}
