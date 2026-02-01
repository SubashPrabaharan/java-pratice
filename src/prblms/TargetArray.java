package prblms;

import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {
        int[] arr1 ={0,1,2,3,4};
        int[] arr2 ={0,1,2,2,1};
        createTarget(arr1,arr2);

    }
    public static void createTarget(int[] arr1,int[] arr2){
        int[] tar = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=1;j<arr2.length;j++){
                if(arr2[j]==arr2[j-1]){
                    tar[i+1] = arr1[arr2[i]];
                }
                else tar[i] = arr1[arr2[i]];
            }
        }
        System.out.println(Arrays.toString(tar));
    }
}
