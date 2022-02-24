package shuhuai.javahomework.trianglecirclecone;

import java.util.Scanner;

public class TestShape {
    public static void TestTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形三边：");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("三角形的周长是" + triangle.getPerimeter() + "。");
        System.out.println("请输入修改后的三角形三边：");
        triangle.setSideOne(scanner.nextDouble());
        triangle.setSideTwo(scanner.nextDouble());
        triangle.setSideThree(scanner.nextDouble());
        System.out.println((triangle.isTriangle() ? "" : "不") + "能构成三角形。");
    }

    public static void TestCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆形的半径：");
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println("圆形的面积：" + circle.getArea() + "");
    }

    public static void TestCone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆锥体的底的半径和高：");
        Cone cone = new Cone(new Circle(scanner.nextDouble()), scanner.nextDouble());
        System.out.println("请输入修改后的圆锥体的底的半径：");
        cone.setBottomRadius(scanner.nextDouble());
        System.out.println("圆锥的体积：" + cone.getVolume() + "。");
    }

    public static void main(String[] args) {
        TestTriangle();
        TestCircle();
        TestCone();
    }
}