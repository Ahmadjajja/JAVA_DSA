import java.util.Arrays;

public class testingQs {
    static public int[][] flipAndInvertImage(int[][] image) {
        int[][] flipImage = new int[image.length][];
        for(int i = 0; i < image.length; i++){
            int[] temp = new int[image[i].length];
            for(int index = 0; index < image[i].length; index++){
                temp[index] = (image[i][(image[i].length - 1) - index]) == 0 ? 1: 0 ;
            }
            flipImage[i] = temp;
        }
        return flipImage;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(arr)[2]));
    }
}
