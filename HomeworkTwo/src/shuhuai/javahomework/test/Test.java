package shuhuai.javahomework.test;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}