import java.util.ArrayList;

class PointD {
	int x;
	int y;

	PointD(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<PointD> pointList = new ArrayList<PointD>();
		pointList.add(new PointD(0, 0));
		pointList.add(new PointD(1, 1));
		pointList.add(new PointD(2, 4));
		pointList.add(new PointD(3, 9));

		for(int i = 0; i < pointList.size(); i++) {
			PointD p = pointList.get(i);
//			PointD p = (PointD) pointList.get(i);
			System.out.println("(" + p.x + "," + p.y + ")");
		}
	}

}
