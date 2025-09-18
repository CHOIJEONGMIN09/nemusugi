package ch3;

public class VillageMain {
    public static void main(String[] args) {
        // Person 객체 5명 저장할 배열 생성
        Person[] residents = new Person[5];

        // 각 인덱스에 Person 객체 생성 후 데이터 입력
        for (int i = 0; i < residents.length; i++) {
            residents[i] = new Person();
        }

        // 주민 정보 세팅
        residents[0].setName("정민");
        residents[0].setAge(25);

        residents[1].setName("가희");
        residents[1].setAge(27);

        residents[2].setName("찬미");
        residents[2].setAge(27);

        residents[3].setName("진");
        residents[3].setAge(27);

        residents[4].setName("소영");
        residents[4].setAge(27);

        // 정보 출력
        System.out.println("=== 마을 주민 정보 ===");
        for (Person p : residents) {
            System.out.println("이름: " + p.getName() + ", 나이: " + p.getAge());
        }
    }
}
