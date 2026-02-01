package prblms;

public class Triangle {
    //wrong approach try to use Dp

    public static void main(String[] args) {
        int[][] trianle ={
                {2},
                {3,4},
                {6,5,7},
                {4,1,8,3}
        };
        System.out.println(minSum(trianle));

    }
    public static  int minSum(int[][] tri){
        int sum =0;
        for(int i=0;i<tri.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<tri[i].length;j++){
                if(tri[i][j] !=0 && tri[i][j]< min){
                    min = tri[i][j];
                }
            }
           sum += min;
        }
        return sum;

    }
}
