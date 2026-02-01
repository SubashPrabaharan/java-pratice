package Backtracking;

public class CountPaths {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    public static  int count(int row,int col){
        //base case
        if(row==1|| col==1){
            return 1;
        }
        int a = count(row-1,col);
        int b = count(row,col-1);
        return a+b;
    }
}
