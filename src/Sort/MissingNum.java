package Sort;

import java.util.ArrayList;
import java.util.List;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(missing(arr));
    }
    //cycle sort
    //if 0 to N --> every element will be at crt index = value
    //if 1 to N --> every element will be at index = value-1
    public static List<Integer> missing(int[] arr){
        int i =0;
        while(i < arr.length){
            int crt = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }
            else i++;
        }
        return findNum(arr);

    }

    static List<Integer> findNum(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
