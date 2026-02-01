package prblms;

import java.util.Arrays;

public class ValidTriangle {
    public static void main(String[] args) {
        int[] arr= {2,2,3,4};
        System.out.println(sol(arr));

    }
    public static int sol(int[] arr){
        Arrays.sort(arr);
        int count =0;
        for(int i =0;i<arr.length-2;i++){
            for(int j = i+1;j< arr.length-1;j++){
                for(int k =j+1;k< arr.length;k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
