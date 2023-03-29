// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class L744FindSmallestLetterGreaterThanTarget122 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(letters[mid ] > target){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'd'));
    }
}
