/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};  
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        System.out.println("hey");
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }


    
}