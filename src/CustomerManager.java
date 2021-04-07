class CustomerCard {
	int id;
	String name;
	String address;
	double shoeSize;
	static int nextId = 1001;
	
	void printInfo() {
		System.out.println("ID：" + this.id);
		System.out.println("名前：" + this.name);
		System.out.println("住所：" + this.address);
	}
	
	CustomerCard(String name) {
		this(name, "");
	}
	
	CustomerCard(String name, String address) {
		this.id = CustomerCard.nextId;
		CustomerCard.nextId++;
		this.name = name;
		this.address = address;
	}
}

class ShoeShopCustomerCard extends CustomerCard {
	double shoeSize;
	
	ShoeShopCustomerCard(String name, String address, double shoeSize) {
		super(name, address);
		this.shoeSize = shoeSize;
	}
	
	ShoeShopCustomerCard(String name) {
		super(name);
	}
	
	void printInfo() {
		System.out.println("[靴屋の顧客情報]");
		super.printInfo();
		System.out.println("靴のサイズ" + shoeSize);
	}
}

class HatShopCustomerCard extends CustomerCard {
	double hatSize;
	
	HatShopCustomerCard(String name, String address, double hatSize) {
		super(name, address);
		this.hatSize = hatSize;
	}
	
	HatShopCustomerCard(String name){
		super(name);
	}
	
	void printInfo() {
		System.out.println("[帽子屋の顧客情報]");
		super.printInfo();
		System.out.println("帽子のサイズ" + hatSize);
	}
}

public class CustomerManager {

	public static void main(String[] args) {
		CustomerCard[] cards = new CustomerCard[100];
//		for(int i = 0; i < 3; i++) {
//			cards[i] = new CustomerCard();
//		}
		cards[0] = new ShoeShopCustomerCard("山田太郎", "東京都", 26.5);
//		cards[0].id = 1001;
//		cards[0].name = "山田太郎";
//		cards[0].address = "東京都";
//		cards[0].shoeSize = 26.5;

		cards[1] = new ShoeShopCustomerCard("佐藤花子", "神奈川県", 24.5);
//		cards[1].id = 1002;
//		cards[1].name = "佐藤花子";
//		cards[1].address = "神奈川県";
//		cards[1].shoeSize = 24.5;

		cards[2] = new ShoeShopCustomerCard("鈴木健二", "茨城県", 26.0);
//		cards[2].id = 1003;
//		cards[2].name = "鈴木健二";
//		cards[2].address = "茨城県";
//		cards[2].shoeSize = 26.0;
		
		cards[3] = new HatShopCustomerCard("渡辺進", "東京都", 57.0);

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
