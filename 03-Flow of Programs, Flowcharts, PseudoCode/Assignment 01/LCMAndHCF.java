// Java program to find LCM of two numbers.
class gfg {
    // Gcd of u and v using recursive method
    static int GCD(int u, int v)
    {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }
 
    // LCM of two numbers
    static int LCM(int u, int v)
    {
        return (u / GCD(u, v)) * v;
    }
 
    // The Driver method
    public static void main(String[] args)
    {
        int u = 8, v = 12;
        System.out.println("GCD of " + u + " and " + v
                           + " is " + GCD(u, v));
        System.out.println("LCM of " + u + " and " + v
                           + " is " + LCM(u, v));
    }
}
