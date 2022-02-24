package shuhuai.javahomework.trianglecirclecone;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double perimeter;
    private boolean isTriangle;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        isTriangle = isTriangle();
        calculatePerimeter();
    }

    private void calculatePerimeter() {
        perimeter = sideOne + sideTwo + sideThree;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setSideOne(double sideOne) {
        if (sideOne > 0) {
            this.sideOne = sideOne;
            isTriangle = isTriangle();
            calculatePerimeter();
        }
    }

    public void setSideTwo(double sideTwo) {
        if (this.sideTwo > 0) {
            this.sideTwo = sideTwo;
            isTriangle = isTriangle();
            calculatePerimeter();
        }
    }

    public void setSideThree(double sideThree) {
        if (sideThree > 0) {
            this.sideThree = sideThree;
            isTriangle = isTriangle();
            calculatePerimeter();
        }
    }

    public boolean isTriangle() {
        return sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne;
    }
}