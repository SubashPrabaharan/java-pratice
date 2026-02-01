package prblms;

public class StringToInteger {
    public static void main(String[] args) {
        String str1 ="1.23";
        String str2 ="3.4.5";
        double num1 = Double.parseDouble(str1);
      double num2 =Double.parseDouble(str2);
        if(num1 < num2) System.out.println("true");
        else System.out.println("false");


    }
}
