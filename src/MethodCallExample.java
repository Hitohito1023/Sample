class Point1 {
	int x;
	int y;

	void printPosition() {
		System.out.println("座標値は(" + this.x + ", " + this.y + ")です。");
	}
	
	void multiply(int n) {
		this.x *= n;
		this.y *= n;
	}
	
	void add(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
public class MethodCallExample {

	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.x = 10;
		p1.y = 5;
		
		p1.printPosition();
		
		p1.multiply(5);
		p1.printPosition();
		
		p1.add(100, 333);
		p1.printPosition();

//		Point1 p2 = new Point1();
//		p2.x = 5;
//		p2.y = 2;
//
//		System.out.println("p1のprintPositionメソッドの呼び出し");
//		p1.printPosition();
//
//		System.out.println("p2のprintPositionメソッドの呼び出し");
//		p2.printPosition();
//
//		System.out.println("プログラムを終了します");
	}

}
