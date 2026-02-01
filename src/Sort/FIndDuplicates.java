package Sort;

import java.util.ArrayList;
import java.util.List;

public class FIndDuplicates {
    public static void main(String[] args) {
        int[] arr ={0,3,2,1,3,2};
        System.out.println(duplicates(arr));

    }
    public static List<Integer> duplicates(int[] arr){
        int i=0;
        while(i< arr.length){
            int crt = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }
            else i++;
        }
        return misNum(arr);
    }
    public static List<Integer> misNum(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j< arr.length;j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
