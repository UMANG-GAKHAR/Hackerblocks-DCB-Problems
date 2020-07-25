import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = new String[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sc.next();
        }
        String rs = commonPrefix(ans, n);
        if (rs.length() > 0) {
            System.out.println(rs);
        } else {
            System.out.println("");
        }

    }

    static int findMinLength(String arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= (n - 1); i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        return min;
    }

    public static boolean allContainsPrefix(String arr[], int n, String str, int start, int end) {
        for (int i = 0; i <= (n - 1); i++) {
            String arr_i = arr[i];

            for (int j = start; j <= end; j++)
                if (arr_i.charAt(j) != str.charAt(j))
                    return false;
        }
        return true;
    }

    public static String commonPrefix(String arr[], int n) {
    if(arr.length==0){
    return "";
    }
        int index = findMinLength(arr, n);
        String prefix = "";

        int low = 0, high = index - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (allContainsPrefix(arr, n, arr[0], low, mid)) {

                prefix = prefix + arr[0].substring(low, mid + 1);

                low = mid + 1;
            } else {// Go for the left part

                high = mid - 1;
            }
        }

        return prefix;
    }

}
