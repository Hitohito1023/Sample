
public class ElseExample {
	public static void main(String[] args) {
		int age = 20;
		
		if(age < 4) {
			System.out.println("入場料は無料です");
		} else if(age < 15) {
			System.out.println("子供料金で入場できます");
		} else {
			System.out.println("大人料金になります");
		}
	}

}
