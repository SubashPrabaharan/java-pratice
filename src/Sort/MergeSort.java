package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        mergeInPlaceSort(arr,0, arr.length);
        System.out.println( Arrays.toString(arr));



    }
    //creating new 2 arrays for each recursion call
    public static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;
        int mid = arr.length/2;


        int[] first = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);

    }
    public static int[] merge(int[] first, int[] second){
        int[] ans = new int[first.length+ second.length];
        int i =0;
        int j=0;
        int k =0;
        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            ans[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;

    }
    //doing sorting in single array
    public static void mergeInPlaceSort(int[] arr,int st,int ed){
       if(ed-st==1) return;
        int mid = st+(ed-st)/2;


         mergeInPlaceSort(arr,st,mid);//first half [5,4]
        mergeInPlaceSort(arr,mid, ed);//second half [3,2,1]

        mergeIn(arr,st,ed,mid);

    }
    public static void mergeIn(int[] arr,int start,int end,int mid){
        int[] ans = new int[end-start];
        int i =start;
        int j=mid;
        int k =0;
        while(i<mid && j< end){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< mid){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j< end){
            ans[k] = arr[j];
            j++;
            k++;
        }

       for(int l=0;l< ans.length;l++){
           arr[start+l] = ans[l];
       }

    }

}
//-----------------Recursion Tree-----------------------------

//mergeInPlaceSort(arr, 0, 5)
//│
//├── mergeInPlaceSort(arr, 0, 2)
//│   │
//│   ├── mergeInPlaceSort(arr, 0, 1)
//│   │   └── (Base case → returns)
//│   │
//│   ├── mergeInPlaceSort(arr, 1, 2)
//│   │   └── (Base case → returns)
//│   │
//│   └── mergeIn(arr, 0, 2, 1)
//│       --> merges [5] & [4]
//│       --> arr becomes [4, 5, 3, 2, 1]
//│
//├── mergeInPlaceSort(arr, 2, 5)
//│   │
//│   ├── mergeInPlaceSort(arr, 2, 3)
//│   │   └── (Base case → returns)
//│   │
//│   ├── mergeInPlaceSort(arr, 3, 5)
//│   │   │
//│   │   ├── mergeInPlaceSort(arr, 3, 4)
//│   │   │   └── (Base case → returns)
//│   │   │
//│   │   ├── mergeInPlaceSort(arr, 4, 5)
//│   │   │   └── (Base case → returns)
//│   │   │
//│   │   └── mergeIn(arr, 3, 5, 4)
//│   │       --> merges [2] & [1]
//│   │       --> arr becomes [4, 5, 3, 1, 2]
//│   │
//│   └── mergeIn(arr, 2, 5, 3)
//│       --> merges [3] & [1,2]
//│       --> arr becomes [4, 5, 1, 2, 3]
//│
//└── mergeIn(arr, 0, 5, 2)
//    --> merges [4,5] & [1,2,3]
//    --> arr becomes [1,2,3,4,5]
