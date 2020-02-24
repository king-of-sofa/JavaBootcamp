package lv.messages;

public class Product {
    private String name;
    public double regularPrice;
    public double discount;
    private double humanReadableDiscount;

    public Product(String name){
        this.name = name;
    }

    double actualPrice(double regularPrice, double discount){
        double actualPrice = regularPrice- (regularPrice * discount /  100);
        return actualPrice;
    }

    public void printInformation(){
        humanReadableDiscount = discount * 100;
        System.out.println("[Product]");
        System.out.println("Name " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + humanReadableDiscount + "%");
        System.out.println("Actual price: " + actualPrice(regularPrice, discount));
    }
}
