package prblms;

import java.util.Arrays;

public class FindFirstAndLast {
    public static int[] findIndex(int[] arr,int tar){
        //traverse the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar)
            for(int j= arr.length-1;j>=i;j--){
                if(arr[j]==tar){
                    return new int[]{i,j};
                }
//                if(arr[i]==tar && arr[j]==tar){
//
//                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr ={1,2,7,7,7,8,8,8};
        int tar= 0;
        System.out.println(Arrays.toString(findIndex(arr,tar)));
    }
}
