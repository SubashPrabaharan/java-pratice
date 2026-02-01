package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
       bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] sorted(int[] arr){
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i=0;
            }
        }
        return arr;
    }

    //with recursion
    public static void  bubbleSort(int[] arr,int i,int j){
        if(i==0) return;

        if(j<i)
        {
           if(arr[j]>arr[j+1]){
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
           bubbleSort(arr,i,j+1);
        }
        bubbleSort(arr,i-1,0);

    }
}
