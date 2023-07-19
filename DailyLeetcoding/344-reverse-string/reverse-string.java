class Solution {
    public void reverseString(char[] s) {
        rev(s, 0, s.length - 1);
        return;
    }
    private static void rev(char[] s, int start, int end){
        if( start >= end ){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        rev(s, ++start, --end);
    }
}