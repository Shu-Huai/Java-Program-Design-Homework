package shuhuai.javahomework.trianglecirclecone;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    public Circle(final Circle circle) {
        radius = circle.radius;
        area = circle.radius;
    }

    private void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            calculateArea();
        }
    }

    public double getArea() {
        return area;
    }
}