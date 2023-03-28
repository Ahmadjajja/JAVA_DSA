// You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

// You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

public class L278FirstBadVersion118 {
    public static int firstBadVersion(int n) {
        int start = 0, end = n;
        while(true){
            int mid = start + ( end - start ) / 2;
            Boolean isBadVersion = isBadVersion(mid);
            if (isBadVersion) {
                if (isBadVersion(mid - 1)) {
                    end = mid - 1;
                    continue;
                }
                return mid;
            }
            start = mid + 1;
        }
    }

    public static boolean isBadVersion(int n) {   // api for guessing number
        int guessingVersion = 6;
        for (int i = guessingVersion; i <= 9; i++) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(firstBadVersion(9));
    }
}
