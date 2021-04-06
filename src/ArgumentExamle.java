class PointA {
	int x;
	int y;

	void multiply(int n) {
		this.x *= n;
		this.y *= n;
	}

	boolean isSamePosition(PointA p) {
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}


public class ArgumentExamle {

	public static void main(String[] args) {
		PointA p1 = new PointA();
		p1.x = 2;
		p1.y = 4;

		PointA p2 = new PointA();
		p2.x = 4;
		p2.y = 8;

		if(p1.isSamePosition(p2) == true) {
			System.out.println("p1とp2は同じ座標です");
		} else {
			System.out.println("p1とp2は異なる座標です");
		}

		p1.multiply(2);

		if(p1.isSamePosition(p2) == true) {
			System.out.println("p1とp2は同じ座標です");
		} else {
			System.out.println("p1とp2は異なる座標です");
		}


	}

}
