import java.text.DecimalFormat;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#");

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        return Math.pow((side1 + side2 + side3)
                * (side2 + side1 - side3)
                * (side2 - side1 + side3)
                * (-side2 + side1 + side3), 0.5) / 4;
    }
    @Override
    public String toString(){
        return "A Triangle with Area = " + decimalFormat.format(getArea()) +", Perimeter = "
                + decimalFormat.format(getPerimeter())
                +".\nSide 1 = " + getSide1()
                +".\nSide 2 = " + getSide2()
                +".\nSide 3 = " + getSide3()
                +".\nThe Triangle is a sup-class of "
                +super.toString();
    }
}
