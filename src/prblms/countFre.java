package prblms;

public class countFre {

    public static void main(String[] args) {
        int[] arr ={10,12,11,9,6,19,11};
        System.out.println(count(arr));

    }
    public static int count(int[] arr) {
        //similar to char frq
        int[] count = new int[101];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
//        for(int i =0;i< count.length;i++){
//            if(count[i]>0) System.out.println(i+" " +count[i]);
//        }
        int ans =0;
        for(int i =0;i< count.length;i++){
            if(count[i]>ans){
                ans = count[i];
            }
        }
//        System.out.println(ans);

        int tot = 0;
        for(int i =0;i<count.length;i++){
            if(count[i]==ans) {
                tot += count[i];
            }
        }

        return tot;
    }
}
