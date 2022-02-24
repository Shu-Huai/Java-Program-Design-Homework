package shuhuai.javahomework.outputprime;

public class OutputPrime {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("101-200之内的素数：");
        int counter = 0;
        for (int i = 101; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                if (++counter % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}