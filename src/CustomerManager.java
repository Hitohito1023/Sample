class CustomerCard {
	int id;
	String name;
	String address;
	double shoeSize;
	
	void printInfo() {
		System.out.println("ID：" + this.id);
		System.out.println("名前：" + this.name);
		System.out.println("住所：" + this.address);
		System.out.println("靴のサイズ：" + this.shoeSize);
	}
	
	CustomerCard(int id, String name, String address, double shoeSize) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.shoeSize = shoeSize;
	}
}

public class CustomerManager {

	public static void main(String[] args) {
		CustomerCard[] cards = new CustomerCard[100];
//		for(int i = 0; i < 3; i++) {
//			cards[i] = new CustomerCard();
//		}
		cards[0] = new CustomerCard(1001, "山田太郎", "東京都", 26.5);
//		cards[0].id = 1001;
//		cards[0].name = "山田太郎";
//		cards[0].address = "東京都";
//		cards[0].shoeSize = 26.5;

		cards[1] = new CustomerCard(1002, "佐藤花子", "神奈川県", 24.5);
//		cards[1].id = 1002;
//		cards[1].name = "佐藤花子";
//		cards[1].address = "神奈川県";
//		cards[1].shoeSize = 24.5;

		cards[2] = new CustomerCard(1003, "鈴木健二", "茨城県", 26.0);
//		cards[2].id = 1003;
//		cards[2].name = "鈴木健二";
//		cards[2].address = "茨城県";
//		cards[2].shoeSize = 26.0;

		for(int i = 0; i < 100; i++) {
			if(cards[i] == null) {
				break;
			}

			System.out.println(i + "番目の顧客カードに記載の情報");
//			System.out.println("ID：" + cards[i].id);
//			System.out.println("名前：" + cards[i].name);
//			System.out.println("住所：" + cards[i].address);
//			System.out.println("靴のサイズ：" + cards[i].shoeSize);
			cards[i].printInfo();
			System.out.println("=================");
		}

	}

}
