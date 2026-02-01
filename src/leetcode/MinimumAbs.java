//Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
//
//        Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//
//        a, b are from arr
//        a < b
//        b - a equals to the minimum absolute difference of any two elements in arr


package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbs {

    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();   //1,3,6,10,15
    list.add(1);
    list.add(3);
    list.add(6);
    list.add(10);
    list.add(15);
        int solu = mini(list);
        System.out.println(mini(list));
        List<List<Integer>> result = ans(list, solu);
        System.out.println(result);
    }
        //minimum abs ans
    public static  int mini(List<Integer> list){

        int mini  = Integer.MAX_VALUE;

        for(int i =0;i<list.size();i++){
            int ans = 0;
            for(int j = i+1;j< list.size();j++){
                    ans =Math.abs(list.get(j)-list.get(i));
                mini = Math.min(mini,ans);
            }

        }
    return mini;
    }

    public static List<List<Integer>> ans( List<Integer> list, int solu ){
        List<List<Integer>> solution = new ArrayList<>();
            for(int i =0;i< list.size();i++){
                for(int j =i+1;j< list.size();j++){
                    int diff = Math.abs(list.get(j)-list.get(i));
                    if(diff == solu){
                        List<Integer> answer = new ArrayList<>();
                        answer.add(list.get(i));
                        answer.add(list.get(j));
                        solution.add(answer);

                    }

                }
            }
            return solution;
    }

}


