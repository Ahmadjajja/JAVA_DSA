class factorial{
    static int factorialFinder(int num){
        if (num == 1 || num == 0) {
            return 1;
        }else {
            return num * factorialFinder(num - 1);
        }
    }
    public static void main(String []args) {
        int number = 3;
        factorialFinder(number);
        System.out.println("factorial = " + factorialFinder(number));
    }
}