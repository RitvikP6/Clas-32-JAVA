import java.util.Scanner;
class BinarySearch {
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array sorted in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        System.out.println("Enter the element to be searched:");
        int x = scn.nextInt();
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);
    }
}