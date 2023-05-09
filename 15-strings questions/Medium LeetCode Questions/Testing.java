import java.util.ArrayList;
import java.util.Arrays;

class Testing {
    public static String defangIPaddr(String address) {
        System.out.println("palindrome(rar) : " + palindrome("rars"));
        return "";
    }
    private static boolean palindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {

        // System.out.println(String.valueOf(1));
        // System.out.println(Integer.valueOf("11"));
        // ArrayList<String> list = new ArrayList<String>();
        // System.out.println(3+2*22*2/3+25);
        // System.out.println(Integer.valueOf("5"));
        // System.out.println("ahmad".substring(0, 1));
        // defangIPaddr("Ahmad");
        // System.out.println("hey"); 
        // StringBuilder str = new StringBuilder("Ahmad");
        // System.out.println(str);
        // str = new StringBuilder("jajja");
        // System.out.println(str);

        // System.out.println(Character.getNumericValue('#'));
        // System.out.println();
        // System.out.println(Arrays.toString(new String[]{}).equals(Arrays.toString(new String[]{"1"})));
        // String name = "ahmad";
        // System.out.println("ahmad".substring(5, 5));

        int[] costs = new int[4];
        
        // System.out.println("krrgw".charAt(0) - "zjxss".charAt(0));
        // System.out.println("krrgw".charAt(1) - "zjxss".charAt(1));
        // System.out.println("krrgw".charAt(2) - "zjxss".charAt(2));
        // System.out.println("krrgw".charAt(3) - "zjxss".charAt(3));
        System.out.println((int) 'z');

        
    }

}