
public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = {50, 55, 70, 65, 80};
		/*scores = new int[5];
		scores[0] = 50;
		scores[1] = 55;
		scores[2] = 70;
		scores[3] = 65;
		scores[4] = 80; */

		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}
