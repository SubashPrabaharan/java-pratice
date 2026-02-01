package prblms;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"a"};
        List<List<String>> result = words(str);

        System.out.println(result);

    }


    public static List<List<String>> words(String[] str){
        List<List<String>> res = new ArrayList<>();
        for(int i =0;i< str.length;i++){

            List<String> list = new ArrayList<>();
            list.add(str[i]);

            for(int j =i+1;j< str.length;j++){
                if(isTrue(str[i],str[j])){
                    list.add(str[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
    public static boolean isTrue(String str1,String str2){

        if(str1.length() != str2.length()) return false;

        int[] count = new int[256];
       for(int i=0;i<str1.length();i++){
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
            }
        for(int i =0;i<count.length;i++){
            if(count[i]!=0) return false;

        }
    return true;

    }
}
