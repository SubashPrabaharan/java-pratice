package Rec;

public class Operation {
    public static void main(String[] args) {
        String str = "3479";
        System.out.println(ConvertTo(str));
    }
    public static boolean arrSum(int[] arr){
//       while(arr.length>2){
//           int[] ans = new int[arr.length-1];
//           for(int i =0;i < arr.length-1;i++){
//               ans[i] = (arr[i]+arr[i+1])%10;
//           }
//           arr = ans;
//       }
//       return arr[0]==arr[1];

        if(arr.length==2){
            return arr[0]==arr[1];
        }

        int[] ans = new int[arr.length-1];
        for(int i=0;i< arr.length-1;i++){
            ans[i] = (arr[i]+arr[i+1])%10;
        }
        return arrSum(ans);


    }


    //str to Arr
    public static boolean ConvertTo(String str){
        int[] arr = new int[str.length()];
        for(int i =0;i<str.length();i++){
            arr[i] = str.charAt(i)-'0';
        }
        return arrSum(arr);
    }
}
