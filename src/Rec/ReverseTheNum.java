package Rec;

public class ReverseTheNum {
    static int sum =0;

    public static void main(String[] args) {

     int num = 1111;
        System.out.println(isPali(num));
    }
    public static int Reverse(int n){
        if(n<=0) return sum;
        int rem= n%10;
        sum = sum*10+rem;
        return Reverse(n/10);


    }
    static boolean isPali(int n){
        return (n == Reverse(n));
    }

}
