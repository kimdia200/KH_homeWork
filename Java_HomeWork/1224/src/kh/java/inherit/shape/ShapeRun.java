package kh.java.inherit.shape;

public class ShapeRun {

	public static void main(String[] args) {
		 Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
	     Rectangle rect = new Rectangle(points, 200, 100);
	     rect.draw();
	     System.out.println("�簢���� �ʺ�� "+rect.getArea()+"�Դϴ�.");
	     System.out.println(rect);
	}
}
