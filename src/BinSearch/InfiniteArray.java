package BinSearch;

public class InfiniteArray {

        public static void main(String[] args) {
            int[] arr ={10,20,30,50,80,90};
            int tar = 60;
            System.out.println(ans(arr,tar));

        }

        public static int ans(int[] arr, int tar){
            int start =0;
            int end = 1;
    //Sliding window(dynamic)
            while(tar>=arr[end]){
                int temp = end+1;
                end += (end-start+1) *2; //window size moving squre times
                start = temp;
            }
            return bs(arr,start,end,tar);
        }

        public static int bs(int[] arr,int start,int end,int target) {
            int mid = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if(arr[mid]==target) return mid;

                if (arr[mid] < target) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
            return start;
        }
    }
