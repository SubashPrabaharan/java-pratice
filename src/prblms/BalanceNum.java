package prblms;

public class BalanceNum {
    public static void main(String[] args) {
        System.out.println(isBalanced(1000));
    }
    public static int isBalanced(int n){
        int i = n+1;
        while(true){
            if(balanced(i))
          return i;
          i++;
        }
    }
    public static boolean balanced(int num){
        int[] count = new int[256];
        int temp = num;
        while(temp>0){
            count[temp%10]++;
            temp /=10;
        }
        for(int j =0;j<count.length;j++){
            if(count[j] !=0 && count[j] != j) return false;
        }
        return true;
    }

}
