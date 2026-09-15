import java.util.*;

public class acp {

    public static void printTargetSumSubsets(int[] arr, int idx, int sos,
                                             int tar, String set) {

        // Base case
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }

        // Include the current element
        printTargetSumSubsets(arr, idx + 1, sos + arr[idx],
                              tar, set + arr[idx] + ", ");

        // Exclude the current element
        printTargetSumSubsets(arr, idx + 1, sos,
                              tar, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        printTargetSumSubsets(arr, 0, 0, tar, "");
    }
}