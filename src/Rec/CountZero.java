package Rec;

public class CountZero {
    public static void main(String[] args) {
        int num = 301020;
        System.out.println(count(num,0));

    }
    static int count(int n,int count){
        if(n==0) return count;
         int rem = n%10;
         if(rem == 0) return count(n/10,count+1);
         return count(n/10,count);
    }
}
