public class Shape {
    private String color = "Green";
    private boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
