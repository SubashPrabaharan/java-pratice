package prblms;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnagrams {
    public static void main(String[] args) {
        String[] words ={"a","b"};
        System.out.println(words(words));

    }


    public static List<String> words(String[] words){
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
                if(!isAangram(words[i],words[i-1])){
                    ans.add(words[i]);
                }
        }
        return ans;
    }

    public static boolean isAangram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] count = new int[256];
        for(int i=0;i< str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i< count.length;i++){
            if(count[i] !=0) return false;
        }
    return true;
    }
}
