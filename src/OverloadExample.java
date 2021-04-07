class PointB {
	int x;
	int y;
	
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void set(PointB p) {
		this.x = p.x;
		this.y = p.y;
	}
}
public class OverloadExample {

	public static void main(String[] args) {
		PointB p1 = new PointB();
		System.out.println("p1の座標は（" + p1.x + ", " + p1.y + "）");
		
		p1.set(10, 0);
		System.out.println("p1の座標は（" + p1.x + ", " + p1.y + "）");
		
		PointB p2 = new PointB();
		p2.set(p1);
		System.out.println("p2の座標は（" + p2.x + ", " + p2.y + "）");

	}

}
