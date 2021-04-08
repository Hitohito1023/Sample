import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList months = new ArrayList();
		months.add("January");
		System.out.println("要素数　" + months.size());
		
		months.add("Februaly");
		System.out.println("要素数　" + months.size());
		
		months.add("March");
		System.out.println("要素数　" + months.size());
		
		System.out.println("== 一覧の出力 ==");
		System.out.println(months.get(0));
		System.out.println(months.get(1));
		System.out.println(months.get(2));
	}

}
