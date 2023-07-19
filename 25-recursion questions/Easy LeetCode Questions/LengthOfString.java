public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(len("Ahmad", 0));
    }

    private static int len(String str, int i) {
        if (str.substring(i) == "") {
            return i;
        }
        return len(str, ++i);
    }
}
