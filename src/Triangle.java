import java.text.DecimalFormat;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#");

    Triangle(){}

    Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void setSide1(double side1){
        this.side1 = side1;
    }
    void setSide2(double side2){
        this.side2 = side2;
    }
    void setSide3(double side3){
        this.side3 = side3;
    }

    private double getSide1(){return side1;}
    private double getSide2(){return side2;}
    private double getSide3(){return side3;}

    private double getArea(){
        return Math.pow((side1 + side2 + side3) * (side2 + side1 - side3)* (side2 - side1 + side3)* (- side2 + side1 + side3) ,0.5)/4;
    }
    private double getPerimeter(){return side1 + side2 + side3;}

    public String toString(){
        return "A Shape with color of " + getColor() + ", " + (isFilled() ? "filled" : "not filled")
                + ", Area = " + decimalFormat.format(getArea()) + ", Perimeter = " + getPerimeter() + ".\nSide 1 = " + getSide1()
                + ".\nSide 2 = " + getSide2() + ".\nSide 3 = " + getSide3();
    }
}
