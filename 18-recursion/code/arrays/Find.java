import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 5, 7, 7, 9};
        System.out.println(find(arr, 7, 0));
        System.out.println(findIndex(arr, 7, 0));
        System.out.println(findIndexLast(arr, 7, arr.length - 1));
        findAllIndex(arr, 7, 0);
        System.out.println(list);
        System.out.println(findAllIndex(arr, 7, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 7, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    // This approach is preferable
    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    // Not good approach because it creating list each time
    static ArrayList findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
