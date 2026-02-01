package BinSearch;

public class FloorNum {

    public static int FloorNum(int[]arr, int tar) {
        int st = 0;
        int ed = arr.length - 1;

        // If target is greater than the largest element, no ceiling exists
        if (tar > arr[ed]) {
            return -1; // or handle separately
        }

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (arr[mid] == tar) {
                return mid; // exact match
            }
            else if (arr[mid] < tar) {
                st = mid + 1;
            }
            else {
                ed = mid - 1;
            }
        }

        // At this point, st is the index of the smallest number >= tar
        return ed;

        //binary search
    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,5,14,16,18};
        int tar = 15;
        System.out.println(FloorNum(arr,tar)); //will print the index
    }
}

