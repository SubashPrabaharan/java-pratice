package prblms;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr ={0};
        System.out.println(isValid(arr));

    }
    public static boolean isValid(int[] arr){
       int max =0;
       for(int i =0;i<arr.length;i++){
           if(i>max)
           {
               return false;
           }
           if(i+arr[i] > max)
           {
               max = i+arr[i];
           }
       }
     return max > arr.length-1;
    }
}
