package Rec;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr ={1,2,32,3,44,5};
        int tar = 32;
        int i =0;
        System.out.println(search(arr,tar,i));
    }
    static int search(int[] arr,int tar,int i){
        if(i==arr.length-1) return -1;
        if(arr[i]==tar) return i;
        return  search(arr,tar,i+1);
    }
}
