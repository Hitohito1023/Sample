class DataSet1 {
//	int x;
//	int y;

	int[] data = new int[1000];
}
public class FreeMemoryTest {
	public static void main(String[] args) {
		System.out.println("空きメモリのサイズ:" + Runtime.getRuntime().freeMemory());
		DataSet1[] data = new DataSet1[100];
		for(int i = 0; i < 100; i++) {
			data[i] = new DataSet1();
			System.out.println("生成済みのインスタンス数:" + (i + 1) + "  空きメモリのサイズ:" + Runtime.getRuntime().freeMemory());
		}

	}

}
