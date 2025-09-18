package ch3;

public class Book {
    private String title;
    private String author;
    private int price;

    // 생성자
    public Book() {}

    // getter/setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 책 정보 출력 메서드
    public void showInfo() {
        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }
}
