import java.util.Scanner;
class BinarySearch {
    int binarySearch(int arr[],int l, int r, int x) {
        if (r>=l) {
            int mid = l + (r-l)/2;
        
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearch(arr, l, mid-1, x);
        return binarySearch(arr, mid+1, r, x);
        
    }
    return -1;
    
}
public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array sorted in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x = scn.nextInt();
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);

}}