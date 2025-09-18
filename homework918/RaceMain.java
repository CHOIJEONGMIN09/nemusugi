package ch3;

public class RaceMain {
    public static void main(String[] args) {
        // 자동차 참가자
        Car car = new Car();
        car.setSpeed(120); // 속도 세팅
        car.move();        // 이동
        System.out.println("이동 후 자동차 속도: " + car.getSpeed() + "km/h\n");

        // 자전거 참가자
        Bicycle bike = new Bicycle();
        bike.setSpeed(30); // 속도 세팅
        bike.move();       // 이동
        System.out.println("이동 후 자전거 속도: " + bike.getSpeed() + "km/h");
    }
}
