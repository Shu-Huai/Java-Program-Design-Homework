package shuhuai.javahomework.sortandsearch;

public class SearchAlgorithm {
    public static int BinarySearch(int[] elems, int elem) {
        int low = 0;
        int high = elems.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (elems[middle] == elem) {
                return middle;
            }
            if (elems[middle] < elem) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}