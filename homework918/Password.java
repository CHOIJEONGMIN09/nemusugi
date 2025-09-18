package ch3;

public class Password {
	
    private String name;
    private String password; // 비밀번호는 외부에서 직접 접근 불가

    // 생성자
    public Password(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // 사용자 이름 getter
    public String getName() {
        return name;
    }

    // 비밀번호 변경 (setter)
    public void setPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("비밀번호가 변경되었습니다.");
    }

    // 비밀번호 확인
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // 사용자 정보 출력
    public void showInfo() {
        System.out.println("사용자 이름: " + name);
        System.out.println("비밀번호의 변경/확인이 불가합니다.");
    }
}
