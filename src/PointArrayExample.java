//class Point {
//	int x;
//	int y;
//}

public class PointArrayExample {

	public static void main(String[] args) {
		Point[] points = new Point[5];
		for(int i = 0; i < 3; i++) {
			points[i] = new Point();
			points[i].x = i;
			points[i].y = i * i;

		}
		for(int i = 0; i < 5; i++) {
			if(points[i] == null) {
				System.out.println("points[" + i + "]は参照がありません");
			} else {
				System.out.println("points[" + i + "]の座標は（" + points[i].x + "," + points[i].y + ")");
			}
		}

	}
}
