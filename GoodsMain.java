package ch3;

public class GoodsMain {

	public static void main(String[] args) {
	
		//추상 클래스는 객체를 생성 못함
		//Goods goods = new Goods();
		
		Goods phone = new Phone("애플");
		
		phone.showBrand();
		phone.turnOn();
		phone.turnOff();

		System.out.println("== tv ==");
		
		Goods tv = new Tv("LG");
		
		tv.showBrand();
		tv.turnOn();
		tv.turnOff();
		
	}

}
