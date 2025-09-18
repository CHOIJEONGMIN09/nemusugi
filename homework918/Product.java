package ch3;

public class Product {
    private String name;
    private int price;

    // 기본 생성자
    public Product() {}

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price + "원";
    }
}
