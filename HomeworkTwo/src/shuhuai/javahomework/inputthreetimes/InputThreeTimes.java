package shuhuai.javahomework.inputthreetimes;

import java.util.Scanner;

public class InputThreeTimes {
    public static void main(String[] args) {
        System.out.println("请输入三个1-100的整数。");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] elems = new int[3];
        while (count != 3) {
            System.out.print("第" + (count + 1) + "个整数：");
            int input = scanner.nextInt();
            if (1 <= input && input <= 100) {
                elems[count++] = input;
            } else {
                System.out.println("输入不在范围内的整数，请重新输入。");
            }
            System.out.println("正确输入次数：" + count + "。");
        }
        System.out.print("正确输入序列为：");
        for (int elem : elems) {
            System.out.print(elem + " ");
        }
        System.out.println("\b。");
    }
}