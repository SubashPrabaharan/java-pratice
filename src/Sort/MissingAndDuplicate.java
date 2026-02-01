package Sort;

import java.util.ArrayList;
import java.util.List;

public class MissingAndDuplicate {
    public static void main(String[] args) {
        int[] arr ={4,3,6,2,1,1};
        System.out.println(cyclicSort(arr));
    }
    public static List<Integer> cyclicSort(int[] arr){
        int i=0;
        while(i< arr.length){
            int crt = arr[i]-1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i]= arr[crt];
                arr[crt] = temp;
            }
            else i++;
        }
        return findNum(arr);
    }
    public static List<Integer> findNum(int[] arr){
        List<Integer> sol = new ArrayList<>();
        //dup and miss
        for(int j =0;j<arr.length;j++){
            if(arr[j] != j+1){
                sol.add(arr[j]);
                sol.add(j+1);
            }
        }
        return sol;


    }
}
