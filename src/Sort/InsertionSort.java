package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(sorted(arr)));

    }
    public static int[] sorted(int[] arr)
    {
        for(int i =1;i<arr.length;){
            if(i>0 && arr[i] <arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
            else i++;
        }
        return arr;
    }

}
