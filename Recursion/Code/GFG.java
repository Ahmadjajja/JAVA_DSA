// A Java program to demonstrate working of
// recursion
class GFG {
    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.printf("\n%d ", test);
            printFun(test - 1); // statement 2
            if (test == 1) {
                System.out.println("\nAfter base condition is met");
            }
            System.out.printf("\n%d ", test);
            return;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int test = 3;
        printFun(test);
    }
}