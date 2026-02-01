package prblms;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr ={1,2,2 };
        List<List<Integer>> op = sub(arr);
        for(List<Integer> list: op ){
            System.out.println(list);
        }

    }

    public static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

       for(int num:arr){
           int n = res.size();
           for(int i =0;i<n;i++){
               List<Integer> ans = new ArrayList<>(res.get(i));
               ans.add(num);
               res.add(ans);
           }
       }
       return res;
    }

    public static class Subseq {
        public static void main(String[] args) {
            List<String> ans = new ArrayList<>();
            subs("","abc",ans);
            System.out.println(ans);

        }
        public static void subs(String p, String up,List<String> ans){
            if(up.isEmpty()){
               ans.add(p);
               return;
            }
            char ch = up.charAt(0);
            subs(p+ch,up.substring(1),ans);
             subs(p,up.substring(1),ans);
        }

    }
}

