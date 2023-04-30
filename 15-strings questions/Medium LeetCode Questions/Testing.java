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
        defangIPaddr("Ahmad");
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

        
        // System.out.println(name.indexOf('h'));
        
        // for (String string : args) {
            
        // }
        
    }

}