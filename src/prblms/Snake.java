package prblms;

public class Snake {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };
        SnakeMat(matrix);
    }
    public static void SnakeMat(int[][] arr){
        int row = arr.length;
        int cols = arr[0].length;
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                for(int j=0;j< cols;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(int k = cols-1;k>=0;k--){
                    System.out.print(arr[i][k]+" ");
                }
            }
        }

    }
}
