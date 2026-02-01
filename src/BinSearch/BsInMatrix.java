package BinSearch;//Not strictly sorted but sorted

import java.util.Arrays;

public class BsInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49}
        };
        int tar = 50;
        System.out.println(Arrays.toString(Bs(mat,tar)));


    }
    public static int[] Bs(int[][] arr ,int tar){
        int row = 0;
        int cols = arr.length-1;
        while(row < arr.length && cols > 0){
            if(arr[row][cols] == tar) return new int[]{row,cols};
            if(arr[row][cols] > tar) cols--;
            else row++;
        }
        return new int[]{-1,-1};
    }
}
