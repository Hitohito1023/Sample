class Point {
	int x;
	int y;
}


public class PointInstanceExample {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 5;
		
		Point p2 = new Point();
		p2.x = 5;
		p2.y = 2;
		
		System.out.println("p1のx座標は" + p1.x);
		System.out.println("p1のy座標は" + p1.y);
		System.out.println("p2のx座標は" + p2.x);
		System.out.println("p2のy座標は" + p2.y);
	}

}
