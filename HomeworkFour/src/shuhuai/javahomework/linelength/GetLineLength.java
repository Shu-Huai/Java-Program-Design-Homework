package shuhuai.javahomework.linelength;

import java.util.Scanner;

public class GetLineLength {
    public static void main(String[] args) {
        Point start;
        Point end;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入直线起点的坐标：");
            start = new Point(scanner.nextInt(), scanner.nextInt());
            System.out.print("请输入直线终点的坐标：");
            end = new Point(scanner.nextInt(), scanner.nextInt());
        }
        Line line = new Line(start, end);
        System.out.println("直线的长度为：" + line.GetLength());
    }
}