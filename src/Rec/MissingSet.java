package Rec;

import java.util.Arrays;

public class MissingSet {

    public static void main(String[] args) {
        int[] arr ={1,1};
        System.out.println(Arrays.toString(SetMiss(arr)));

    }
    public static int[] SetMiss(int[] arr){
        //cycle sort -- 1 to N
        int i =0;
        while(i<arr.length){
            int crt = arr[i]-1;
            if(arr[i] >0 && arr[i] <= arr.length && arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }
            else i++;
        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
