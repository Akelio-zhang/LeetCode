public class Solution {
    public double myPow(double x, int n) {
        if (x == 0)
            return 0.0;
        if (n == 0)
            return 1.0;
        if (n == 1)
            return x;
        if (n % 2 == 0)
            return myPow(x*x, n/2);
        return (n > 0 ? x : 1/x) * myPow(x*x, n/2);
    }
}