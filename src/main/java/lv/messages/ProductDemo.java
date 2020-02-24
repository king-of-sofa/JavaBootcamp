package lv.messages;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.regularPrice = 20.0;
        milk.discount = 0.1;
        milk.printInformation();
    }
}
