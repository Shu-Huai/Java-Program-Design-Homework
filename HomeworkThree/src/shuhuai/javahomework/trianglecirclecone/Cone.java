package shuhuai.javahomework.trianglecirclecone;

public record Cone(Circle bottom, double height) {
    public Cone(Circle bottom, double height) {
        this.bottom = new Circle(bottom);
        this.height = height;
    }

    public void setBottomRadius(double radius) {
        if (radius > 0) {
            bottom.setRadius(radius);
        }
    }

    public double getVolume() {
        return 1.0 / 3.0 * bottom.getArea() * height;
    }
}