package ch3;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        // 값 설정(setter)
        product.setName("노트북");
        product.setPrice(2000000);

        // 출력(toString)
        System.out.println(product.toString());
        // toString은 객체 출력 시 자동 호출되므로
        // System.out.println(product); 만 해도 됨
    }
}
