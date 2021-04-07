class Point2 {
	static int counter = 0;
	int x;
	int y;
	
	Point2(int x, int y) {
		System.out.println("Point2クラスのコンストラクタが呼び出されました");
		this.x = x;
		this.y = y;
		Point2.counter++;
	}
}
public class StaticVariableExample {
	public static void main(String[] args) {
		Point2[] points = new Point2[5];
		System.out.println("Point2.counter=" + Point2.counter);
		points[0] = new Point2(0, 0);
		System.out.println("Point2.counter=" + Point2.counter);
		points[1] = new Point2(5, 0);
		System.out.println("Point2.counter=" + Point2.counter);
		points[2] = new Point2(10, 5);
		System.out.println("Point2.counter=" + Point2.counter);
	}

}
