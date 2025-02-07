package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area(double width, double height) {
        return width * height;
    }

    public double Perimeter(double width, double height) {
        return (width + height) * 2;
    }

    public double Diagonal(double width, double height) {
        return Math.sqrt(width * width + height * height);
    }
}
