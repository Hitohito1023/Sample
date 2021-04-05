
public class SwitchExample {
	public static void main(String[] args) {
		int score = 10;
		
		switch(score) {
		case 1:
			System.out.println("もっとがんばりましょう");
			break;
		case 2:
			System.out.println("もう少しです");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
			System.out.println("お見事");
			break;
		default:
			System.out.println("予期しない点数です");
		}
		
		int c = (score > 100)? 30 : 40;
		
		System.out.println(c);
	}

}
