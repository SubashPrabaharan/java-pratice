package Rec;

public class Reduction {
    public static void main(String[] args) {
    int num = 5;

        num--;
        System.out.println(reduce(num));
    }
    static int reduce(int n){
        if(n==0) return n;
        System.out.println(n);
        return reduce(n--);

    }

}
