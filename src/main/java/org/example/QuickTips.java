package org.example;

public class QuickTips {
    public static void main(String[] args) {
        char[] c = new char[]{'a','s','d','f','g'};
        System.out.println(new String(c,0,3));
        System.out.println(String.valueOf(c,0,3));

        int n=0; int k =1;
        if( (n==0)^(k==0)){
            System.out.println("either of the 2 conditions should be true, but not both");
        }

        // whether a num is power of k
        System.out.println(QuickTips.ifPowerOfK(27,3));
        n=0;
        int num = 1;
        while(n<10){
            num = num*3;
//            System.out.println(num+"   "+ifPowerOfK(num,3));
            System.out.println(num+"   "+isPower(num,3));
           n++;
        }

        System.out.println(Math.log(243)/Math.log(3));
        System.out.println(Math.pow(3,5));
        System.out.println(243.0%1);

        // conclusion - this solution does not work always as we saw that 243 is power of 3 but because
        // of the broke in floating point system it always won't give relieable output






    }
    public static boolean ifPowerOfK(int num, int k){
        double d = Math.log(num)/Math.log(k);
        return d%1==0;
    }
    public static boolean isPower(int y, int x)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;

        // Check if power of x becomes y
        return (pow == y);
    }

    // For more Optimized approach
            /*
            * 1) Initialize pow = x, i = 1
        2) while (pow < y)
           {
              pow = pow*pow
              i *= 2
           }
        3) If pow == y
             return true;
        4) Else construct an array of powers
           from x^i to x^(i/2)
        5) Binary Search for y in array constructed
           in step 4. If not found, return false.
           Else return true.
        */

}
