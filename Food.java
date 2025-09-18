package ch3;

//자식 클래스
public class Food extends Product {

	String maker;

	public Food(String name, int price, String maker) {
		super(name, price);
		this.maker = maker;
	}

	public void showFood() {
		showInfo();
		System.out.println("생상자: " + maker);
	}

}
