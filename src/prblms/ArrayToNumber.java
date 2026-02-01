package prblms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int k =2;
        System.out.println(nums(arr,k));

    }
    public static List<Integer> nums(int[] arr, int k) {
        long num = 0;
        for (int i = 0; i < arr.length; i++) {
         num = num*10 + arr[i];
        }
        long tot = num+k;
        return toList(tot);
    }

    public static List<Integer> toList(long tot){
        List<Integer> ans = new ArrayList<>();
//        String str = String.valueOf(tot);
//        for(char ch: str.toCharArray()){
//            ans.add(ch -'0');
//        }
//        return ans;

        if(tot==0){
            ans.add(0);
            return ans;
        }
        while(tot >0){
            ans.add((int)tot%10);
            tot/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
