public class SumOfNaturalNumber{
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(3, 0, 1));
    
    }
    private static int sumOfNaturalNumber(int num,int sum, int counting ) {
        if (counting == num) {
            return sum + counting;
        }
        return sumOfNaturalNumber(num, sum + counting, ++counting);

    }
}