import java.util.ArrayList;

public class MinMax{
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        minMax(arr, 0);
        System.out.println("minimum : " + min);
        System.out.println("maximum : " + max);
        System.out.println(minMax2(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    private static void minMax(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        min = Math.min(min, arr[index]);
        max = Math.max(max, arr[index]);
        minMax(arr, ++index);
    }
    private static ArrayList<Integer> minMax2(int[] arr, int index, int min, int max){
        if(index == arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(min);
            list.add(max);
            return list;
        }
        min = Math.min(min, arr[index]);
        max = Math.max(max, arr[index]);
        return minMax2(arr, ++index, min, max); 
    }
}