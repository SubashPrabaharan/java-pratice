package Backtracking;

public class BackTracking {

    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false ,true},
                {true,true,true}
        };
        Bt("",arr,0,0);

    }
    public static void Bt(String p,boolean[][] arr,int row,int col){
        //base case
        if(row == arr.length-1 && col == arr[0].length-1){
            System.out.println(p);
            return;
        }
//        if(row< arr.length-1 && col<arr[0].length-1){
//            Bt(p+"D",arr,row+1,col+1);
//        }
        if(!arr[row][col]) return;

        arr[row][col] = false;

        if(row < arr.length-1){
            Bt(p+"D",arr,row+1,col);
        }
        if(col < arr[0].length-1){
            Bt(p+"R",arr,row,col+1);
        }
        if(row>0){
            Bt(p+"U",arr,row-1,col);
        }
        if(col>0){
            Bt(p+"L",arr,row,col-1);
        }
        arr[row][col] = true;
    }
}
