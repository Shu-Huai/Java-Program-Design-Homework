package shuhuai.javahomework.sortandsearch;

public class SortAlgorithm {
    public static void bubbleSort(int[] elems) {
        for (int i = 0; i < elems.length - 1; i++) {
            for (int j = 0; j < elems.length - 1 - i; j++) {
                if (elems[j] > elems[j + 1]) {
                    int temp = elems[j];
                    elems[j] = elems[j + 1];
                    elems[j + 1] = temp;
                }
            }
        }
    }
}