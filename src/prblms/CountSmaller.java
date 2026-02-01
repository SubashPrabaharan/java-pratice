package prblms;

import java.util.Arrays;

public class CountSmaller {
    public static void main(String[] args) {
        int[] arr ={8,1,2,2,3};
        System.out.println(Arrays.toString(count(arr)));

    }
    public static  int[] count(int[] arr){
        int[] count = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int c =0;
            for(int j =0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    c++;

                }

            }
            count[i] = c;
        }

return count;
    }
}
