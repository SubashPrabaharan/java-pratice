package leetcode;



//You are given a string s consisting of lowercase English letters.
//
//A substring of s is called balanced if all distinct characters in the substring appear the same number of times.
//
//Return the length of the longest balanced substring of s.

public class BalancedStr {
    public static void main(String[] args) {
            String string =  "zz";
        System.out.println(longstr(string));
    }

    public static int longstr(String str){

        int maxLen = 0;
        for(int i =0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
                if(isValid(str,i,j)){
                    maxLen = Math.max(maxLen,j-i+1);
                }

            }

        }
        return maxLen;
    }

    public static  boolean isValid(String str,int i,int j){
        int[] arr = new int[256];

        for(int k =i;k<=j;k++){
            arr[str.charAt(k)]++;
        }
        int count =0;
        for(int c = 0; c < arr.length; c++){
            if(arr[c]!=0){
                if(count==0){
                    count = arr[c];
                }
                else if (arr[c]!=count){
                    return false;
                }
            }
        }
        return true;
    }


}
