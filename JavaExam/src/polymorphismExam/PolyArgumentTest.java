package polymorphismExam;

import java.util.Vector;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);// Tv을/를 구입하셨습니다.
		b.buy(com);// Computer을/를 구입하셨습니다.
		b.buy(audio);// Audio을/를구입하셨습니다.
		b.summary();// 구입하신 물품의 총금액은 350만원입니다. 구입하신 제품은 Tv, Computer, Audio입니다.
		System.out.println();
		b.refund(com); // Computer을/를 반품하셨습니다.
		b.refund(com);
		b.summary();// 구입하신 물품의 총금액은 150만원입니다. 구입하신 제품은 Tv, Audio입니다.

	}
}

class Product {
	int price;
	int bonusPoint;
	String name;

	Product(int price, String name) {
		this.price = price;
		this.name = name;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100, "Tv");
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200, "Computer");
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50, "Audio");
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	Vector<Product> itemList = new Vector<>();

	public void buy(Product p) {
		itemList.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name + "을/를 구입하셨습니다.");
		System.out.printf("현재 잔고/포인트는 %d만원/%d점 입니다.\n", money, bonusPoint);
	}

	public void refund(Product p) {
		boolean flag = false;
		if (itemList.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
		} else {
			for (Product pp : itemList) {
				if (pp.name.equals(p.name)) {
					flag = true;
				} else {
					continue;
				}
			}
			if (flag) {
				itemList.remove(p);
				money += p.price;
				bonusPoint -= p.bonusPoint;
				System.out.println(p.name + "을/를 반품하셨습니다.");
				System.out.printf("현재 잔고/포인트는 %d만원/%d점 입니다.\n", money, bonusPoint);
			} else {
				System.out.println("해당 제품을 구매하지 않았습니다.");
			}

		}
	}

	public void summary() {
		int tPrice = 0;
		String pName = "";
		if (itemList.isEmpty()) {
			System.out.println("구입하신 물품이 없습니다.");
		} else {
			for (Product p : itemList) {
				pName += p + ", ";
				tPrice += p.price;
			}
			System.out.printf("구입하신 물품의 총금액은 %d만원입니다.\n", tPrice);
			System.out.printf("구입하신 제품은 %s입니다.\n", pName);
		}

	}

}
