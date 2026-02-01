package prblms;

import java.util.Arrays;

public class MedianOfArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println(median(arr1,arr2));
    }

    public static double median(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] arr3 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }

        Arrays.sort(arr3);
        return ans(arr3);
    }

    public static double ans(int[] arr) {
        int st = 0;
        int ed = arr.length - 1;
        int mid = st+(ed-st)/2;
        if (arr.length%2==1) {
            return arr[mid];
        }
        else
        {
            return (arr[mid]+arr[mid+1])/2.0;
        }

    }
}
