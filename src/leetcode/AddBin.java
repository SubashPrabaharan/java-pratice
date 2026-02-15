package leetcode;

public class AddBin {

    public static void main(String[] args) {
       String  a = "11", b = "1";
        System.out.println(add(a,b));

    }

    public static String add(String s1,String s2){
        int n1 = Integer.parseInt(s1,2);
        int n2 = Integer.parseInt(s2,2);
        int sum = n1+n2;
        return Integer.toBinaryString(sum);
    }
}
