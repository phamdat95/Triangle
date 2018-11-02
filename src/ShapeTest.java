public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape.setColor("Blue");
        shape.setFilled(false);
        System.out.println(shape.toString() + "\n");

        shape = new Shape("red", false);
        System.out.println(shape.toString());
        shape.setColor("Yellow");
        shape.setFilled(true);
        System.out.print(shape.toString());
    }
}
