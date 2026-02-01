package prblms;

import java.util.Arrays;

public class SumOfElements {

    public static int[] sumOf(int[] arr) {
        Arrays.sort(arr);

        //two pointers
        int sum =0;
        for(int i=0;i< arr.length-2;i++){
            int l = i+1;
            int r = arr.length-1;

            while(l <r){
                sum = arr[i]+arr[l]+arr[r];
                if(sum==0) return new int[]{arr[i],arr[l],arr[r]};

                else if (sum<0) {
                    l++;
                }
                else r--;
            }
        }
        return new int[]{-1,-1,-1};
    }

    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(sumOf(arr)));
    }
}
