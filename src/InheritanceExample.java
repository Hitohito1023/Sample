class PointC {
	int x;
	int y;
	
	void printInfo() {
		System.out.println("座標値は（" + x + ", " + y + "）です");
	}
}

class ColorPoint extends PointC {
	String color;
}
public class InheritanceExample {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.x = 5;
		cp.y = 10;
		cp.color = "赤";
		cp.printInfo();
	}

}
