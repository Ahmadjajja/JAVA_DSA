import java.util.Arrays;

public class SumTryangleFromArr{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriAngle(arr);
    }
    private static void printTriAngle(int[] arr){
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        printTriAngle(temp);
        System.out.println(Arrays.toString(arr));
    }
}