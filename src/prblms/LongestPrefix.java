package prblms;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(prefix(arr));
    }

    public static String prefix(String[] str) {
        if (str == null || str.length == 0) return "";

        String ans = "";
        String first = str[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            boolean allMatch = true;
            for (int j = 1; j < str.length; j++) {
                if (!isValid(first, str[j], i)) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                ans = ans + ch;
            } else {
                break;
            }
        }

        return ans;
    }
    public static boolean isValid(String str1, String str2, int pos) {
        if (pos >= str1.length() || pos >= str2.length()) return false;

        int[] count = new int[256];
        count[str1.charAt(pos)]++;
        count[str2.charAt(pos)]--;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }
}
