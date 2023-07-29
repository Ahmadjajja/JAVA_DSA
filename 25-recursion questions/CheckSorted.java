public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {20, 21, 22, 45, 49, 89, 90};
        System.out.println(checkSorted(arr, 0));
    }
    static String checkSorted(int[] arr, int index){
        if (index == arr.length - 1) {
            return "Yes";
        }
        if (arr[index] > arr[index + 1]) {
            return "No";
        }
        return checkSorted(arr, ++index);
    }
}
