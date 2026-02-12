package prblms;

import java.util.ArrayList;
import java.util.List;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,6};
        System.out.println(diff(arr1,arr2));

    }

    public static List<List<Integer>> diff(int[] arr1, int[] arr2){

        List<List<Integer>> solu = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=0;i< arr1.length;i++){
            if(!isTrue(arr2,arr1[i]) && !list1.contains(arr1[i])){
                list1.add(arr1[i]);
            }
        }

        for(int j=0;j<arr2.length;j++){
            if(!isTrue(arr1,arr2[j]) && !list2.contains(arr2[j])){
                list2.add(arr2[j]);
            }
        }
        solu.add(list1);
        solu.add(list2);

        return solu;

    }

    public static boolean isTrue(int[] arr,int val){
        for(int i =0;i<arr.length;i++){
            if(val==arr[i]){
                return true;
            }
        }
        return false;
    }
}
