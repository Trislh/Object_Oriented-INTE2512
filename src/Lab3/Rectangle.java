package Lab3;

class Rectangle {
    // Data field
    private final double width, height;

    // Methods
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return Math.ceil(width * height);
    }
    public double getPerimeter() {
        return Math.ceil((width * height) * 2);
    }
}
