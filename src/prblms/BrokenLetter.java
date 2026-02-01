package prblms;

public class BrokenLetter {

    public static void main(String[] args) {
        String str1 ="hello wolrd";
        String str2 ="ak";
        System.out.println(Broken(str1,str2));

    }
    public static int  Broken(String str1,String str2){

        String[] arr = str1.split(" ");

        for(String letters : arr){
            for(int i=0;i<letters.length();i++){
                for(int j =0;j<str2.length();j++){
                    if(letters.charAt(i)==str2.charAt(j)){
                        return -1;
                    }
                }

            }

        }
    return 1;
    }

}
