package Backtracking;

public class Path {
    //diogonal paths
    public static void main(String[] args) {
        pathWithSt("",1,1);
    }
//    public static void path(String p,int row, int col){
//        if(row==1 && col==1) System.out.println(p);
//        if(row>1 && col>1){
//            path(p+"D",row-1,col-1);
//        }
//        if(row>1){
//            path(p+"V",row-1,col);
//        }
//        if(col>1){
//            path(p+"H",row,col-1);
//        }
//    }
    public static void pathWithSt(String p,int row, int col){//from start
        if(row==3 && col==3) {
            System.out.println(p);
            return;
        }
        if(row<3 && col<3){
            pathWithSt(p+"D",row+1,col+1);
        }
        if(row<3){
            pathWithSt(p+"V",row+1,col);
        }
        if(col<3){
            pathWithSt(p+"H",row,col+1);
        }
    }


}
