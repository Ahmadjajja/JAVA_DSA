// Volume Of Prism

// The formula for the volume of a prism depends on the shape of its base. For a prism with a rectangular base, the formula is:

// V = l * w * h

// where V is the volume of the prism, l is the length of the base, w is the width of the base, and h is the height of the prism.



import java.util.*;

public class VolumeOfPrism24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base, the width of the base and and the height of the prism with a rectangular base: ");
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        System.out.println("Volume Of Prism with a rectangular base is: " +  (l * w * h));
    }
}