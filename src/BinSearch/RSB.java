package BinSearch;

public class RSB {

    public static void main(String[] args) {

    }

    public static int findIndex(int[] arr, int tar) {
        int piv = findPivot(arr);
        if (piv == -1) {
            return BinarySearch(arr, tar, 0, arr.length - 1);
        }
        if (arr[piv] == tar) return piv;

        if (tar >= arr[0]) {
            return BinarySearch(arr, tar, 0, piv - 1);
        }

        return BinarySearch(arr, tar, piv + 1, arr.length - 1);
    }

    public static int BinarySearch(int[] arr, int tar, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == tar) return mid;
            if (arr[mid] < tar) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
