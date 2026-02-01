package Sort;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr ={2,3,1,6,4};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    //Selection sort
    public static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = maxIndex(arr,0,last);
            //swap
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }

    }
    //find the max
    public static int maxIndex(int[] arr,int start,int last){
        int max =start;
        for(int i =start;i<last;i++){
            if(arr[i] > arr[max]) max = i;
        }
        return max;
    }
}
