package ch3;

public class PasswordMain {
    public static void main(String[] args) {
        // 객체 생성
        Password user = new Password("민지", "1234");

        // 사용자 정보 출력
        user.showInfo();

        // 비밀번호 확인
        System.out.println("비밀번호 '1234' 확인 결과: " + user.checkPassword("1234")); // true
        System.out.println("비밀번호 '0000' 확인 결과: " + user.checkPassword("0000")); // false

        // 비밀번호 변경
        user.setPassword("5678");

        // 변경된 비밀번호 확인
        System.out.println("비밀번호 '5678' 확인 결과: " + user.checkPassword("5678")); // true
    }
}
