package Backtracking;

import java.util.Arrays;

public class allPath {
    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,true ,true},
            {true,true,true}
    };
        int[][] path = new int[arr.length][arr[0].length];
    Bt("",arr,0,0,path,1);
    }
    public static void Bt(String p,boolean[][] arr,int row,int col,int[][] path,int step){
        //base case
        if(row == arr.length-1 && col == arr[0].length-1){
            path[row][col]= step;
            for(int[] arr1:path){
                System.out.println(Arrays.toString(arr1));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
//        if(row< arr.length-1 && col<arr[0].length-1){
//            Bt(p+"D",arr,row+1,col+1);
//        }
        if(!arr[row][col]) return;
        path[row][col]= step;
        arr[row][col] = false;


        if(row < arr.length-1){
            Bt(p+"D",arr,row+1,col,path,step+1);
        }
        if(col < arr[0].length-1){
            Bt(p+"R",arr,row,col+1,path,step+1);
        }
        if(row>0){
            Bt(p+"U",arr,row-1,col,path,step+1);
        }
        if(col>0){
            Bt(p+"L",arr,row,col-1,path,step+1);
        }
        path[row][col]=0;
        arr[row][col] = true;

    }
}
