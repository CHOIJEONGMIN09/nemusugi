package ch3;

public class Bicycle implements Vehicle {
    private int speed; // 속도는 비밀 (private)

    // 속도 setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // 속도 getter
    public int getSpeed() {
        return speed;
    }

    // move 구현
    @Override
    public void move() {
        System.out.println("자전거가 시속 " + speed + "km로 달립니다.");
    }
}
