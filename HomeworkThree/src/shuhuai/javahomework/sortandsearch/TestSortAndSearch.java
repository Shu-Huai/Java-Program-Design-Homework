package shuhuai.javahomework.sortandsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSortAndSearch {
    public static void testSort(int[] elems) {
        SortAlgorithm.bubbleSort(elems);
        System.out.print("排序结果为：");
        for (int elem : elems) {
            System.out.print(elem + " ");
        }
        System.out.println("。");
    }

    public static void testSearch(int[] elems) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数据：");
        int index = SearchAlgorithm.BinarySearch(elems, scanner.nextInt());
        System.out.println(index == -1 ? "数据不在数组中。" : "这个数据的索引号为：" + index + "。");
    }

    public static void main(String[] args) {
        System.out.print("请输入一组数据，以空格分隔，以回车结束：");
        Scanner scanner = new Scanner(new Scanner(System.in).nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }
        int[] elems = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            elems[i] = arrayList.get(i);
        }
        testSort(elems);
        testSearch(elems);
    }
}