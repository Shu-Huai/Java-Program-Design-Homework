package shuhuai.javahomework.exactdivision;

public class ExactDivision {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count++;
                System.out.printf("第%d个数为：%d。\n", count, i);
            }
            if (count == 5) {
                break;
            }
        }
    }
}