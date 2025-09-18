package ch3;

public class AnimalMain {

	public static void main(String[] args) {
		
		//인스턴스 생성 - Animal 인터페이스 타입으로 여러 객체를 담아 똑같은 메서드 호출 가능
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		
		//메서드
		animal1.sound();
		animal2.sound();
		
	}

}
