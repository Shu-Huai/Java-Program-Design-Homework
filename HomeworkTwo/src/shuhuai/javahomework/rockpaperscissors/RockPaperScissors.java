package shuhuai.javahomework.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.print("请输入1、2和3，分别作为剪刀、石头和布：");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3) + 1;
        switch (people) {
            case 1:
                switch (computer) {
                    case 1 -> System.out.println("玩家：剪刀。\n电脑：剪刀。\n平局。");
                    case 2 -> System.out.println("玩家：剪刀。\n电脑：石头。\n电脑获胜。");
                    case 3 -> System.out.println("玩家：剪刀。\n电脑：布。\n玩家获胜。");
                }
                break;
            case 2:
                switch (computer) {
                    case 1 -> System.out.println("玩家：石头。\n电脑：剪刀。\n玩家获胜。");
                    case 2 -> System.out.println("玩家：石头。\n电脑：石头。\n平局。");
                    case 3 -> System.out.println("玩家：石头。\n电脑：布。\n电脑获胜。");
                }
                break;
            case 3:
                switch (computer) {
                    case 1 -> System.out.println("玩家：布。\n电脑：剪刀。\n电脑获胜。");
                    case 2 -> System.out.println("玩家：布。\n电脑：石头。\n玩家获胜。");
                    case 3 -> System.out.println("玩家：布。\n电脑：布。\n平局。");
                }
                break;
        }
    }
}