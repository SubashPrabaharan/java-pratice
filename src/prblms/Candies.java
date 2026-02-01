package prblms;

import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int[] arr ={2,3,5,1,3};
        int n =3;
        System.out.println(Arrays.toString(candies(arr,n)));

    }
    public static boolean[] candies(int[] arr, int n){
        boolean[] res = new boolean[arr.length];
            //find max
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max) {
                max = arr[i];
            }
        }
        for(int i =0;i< arr.length;i++){
            if(n+arr[i]>=max){
                res[i] = true;
            }
            else res[i] = false;
        }
       return res;
    }
}
