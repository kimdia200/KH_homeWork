package kh.java.inherit.shape;

public class ShapeRun {

	public static void main(String[] args) {
		 Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
	     Rectangle rect = new Rectangle(points, 200, 100);
	     rect.draw();
	     System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
	     System.out.println(rect);
	}
}
