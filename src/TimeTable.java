
public class TimeTable {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int ans = i * j;
				System.out.print(j + "×" + i + "=" + ans);
				System.out.print("   ");
			}
			System.out.println();
		}
	}

}
