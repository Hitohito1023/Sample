
public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] scores = { {50, 55, 70, 65, 80},
				   		 	{60, 77, 90},
				   		 	{66}
		};
		
		System.out.println(scores.length);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]);
				System.out.print("   ");
			}
			System.out.println();
		}
	}

}
