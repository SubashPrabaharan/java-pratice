package BinSearch;

public class BsInRec {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int tar = 4;
        System.out.println(bs(arr,tar,0, arr.length-1));

    }
    public static int bs(int[] arr,int tar,int st,int ed){
        //using rec
        if(st> ed) return -1;
        int mid = st+(ed-st)/2;
        if(arr[mid] == tar) return mid;
        if(tar < arr[mid]) return bs( arr, tar,0,mid-1);
        return bs(arr,tar,mid+1,ed);
    }
}
