package Rec;

public class StepsCount {
    public static void main(String[] args) {
        int num1= 10;
        int num2 = 10;
        System.out.println(steps(num1,num2));
    }
    public static int steps(int num1,int num2){
        int count = 0;
        while (num1<=num2 && num1!=0){
            num2 = num2-num1;
            count++;
        }
         while(num1>=num2 && num2!=0){
            num1 = num1-num2;
            count++;
        }
        if(num1==0 || num2==0){
            count++;
        }

        return count;
    }

}
