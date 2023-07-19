public class FindingUpperCaseLetter {
    public static void main(String[] args) {
        System.out.println(upperCase("ahmadjajja", 0));
    }

    private static char upperCase(String str, int i) {
        if (i == str.length()) {
            return ' ';
        }
        if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
            return str.charAt(i);
        }
        return upperCase(str, ++i);
    }
}
