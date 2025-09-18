package ch3;

public class LibraryMain {
    public static void main(String[] args) {
        // TextBook 객체 생성 및 정보 저장
        TextBook tb = new TextBook();
        tb.setTitle("생활과윤리");
        tb.setAuthor("최정민");
        tb.setPrice(20000);
        tb.setSubject("윤리");

        // Novel 객체 생성 및 정보 저장
        Novel novel = new Novel();
        novel.setTitle("나미야 잡화점의 기적");
        novel.setAuthor("히가시노 게이고");
        novel.setPrice(30000);
        novel.setGenre("SF");

        // 정보 출력
        System.out.println("=== 소설 ===");
        tb.showInfo();

        System.out.println("=== 소설 ===");
        novel.showInfo();
    }
}
