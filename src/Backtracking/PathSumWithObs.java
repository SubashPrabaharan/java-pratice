package Backtracking;

public class PathSumWithObs {
    public static void main(String[] args) {
            boolean[][] arr = {
                    {true,true,true},
                    {true,false ,true},
                    {true,true,true}
        };
       path("",arr,0,0);
    }
    public static void path(String p,boolean[][] arr,int row,int col){
        if(row ==arr.length-1 && col ==arr[0].length-1) System.out.println(p);

        if(!arr[row][col]){
            return;
        }
        if(row < arr.length-1){
            path(p+"D",arr,row+1,col);
        }
        if(col<arr[0].length-1){
            path(p+"R",arr,row,col+1);
        }

    }
}
