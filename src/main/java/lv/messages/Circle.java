package lv.messages;

public class Circle {

    private double radius;
    private double area;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

}
