package ch3;

public class Tv extends Goods {
	
	public Tv(String brand) {
		super (brand);
	}
	
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}

}
