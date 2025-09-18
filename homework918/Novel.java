package ch3;

public class Novel extends Book {
    private String genre; // 장르

    public Novel() {}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 오버라이딩해서 책 정보 + 장르 출력
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("장르: " + genre);
    }
}
