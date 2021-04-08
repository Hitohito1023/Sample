import java.util.ArrayList;
import java.util.Collections;

class Ppoint implements Comparable<Ppoint> {
	int x;
	int y;
	
	Ppoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Ppoint p) {
		return (this.x + this.y) - (p.x + p.y);
	}
}

public class SortExample {
	public static void main(String[] args) {
		ArrayList<Ppoint> pointList = new ArrayList<Ppoint>();
		pointList.add(new Ppoint(0, 8));
		pointList.add(new Ppoint(1, 6));
		pointList.add(new Ppoint(2, 9));
		pointList.add(new Ppoint(3, 3));
		
		Collections.sort(pointList);
		
		for(Ppoint p : pointList) {
			System.out.println("(" + p.x + "," + p.y + ")->" + (p.x + p.y));
		}
	}

}
