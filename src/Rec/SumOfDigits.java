package Rec;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digits(1342));

    }
    public static int digits(int n){
        if(n==0) return n;
       return (n%10) + digits(n/10);
    }
}
