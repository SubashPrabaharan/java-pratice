package Rec;

public class ReduceToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(reduce(num,0));
    }
    public static int reduce(int num,int count){
        if(num==0) return count;

        if(num%2==0) return reduce(num/2,count+1);
        return reduce(num-1,count+1);
    }
}
