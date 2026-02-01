package Backtracking;

public class RSB_Rec {
    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,1,2,3};
        int tar =2;
        System.out.println(search(arr,tar,0,arr.length-1));
    }
    public static int search(int[] arr,int tar,int st,int ed){
        int mid = st+(ed-st)/2;
        if(arr[mid]==tar) return mid;
        if(arr[st]<=arr[mid])
        {
            if(tar>=arr[st] && tar<= arr[mid]){
              return search(arr,tar,st,mid-1);
            }
           else return search(arr,tar,mid+1,ed);
        }
        if(tar>=arr[mid] && tar<=arr[ed]){
            return search(arr,tar,mid+1,ed);
        }
        return search(arr,tar,st,mid-1);
    }
}
