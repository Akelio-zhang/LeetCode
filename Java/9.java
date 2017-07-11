public class Solution {
    public boolean isPalindrome(int x) {
        int halfNum = 0;
        if (x < 0 || (x !=0 && x % 10 == 0))
            return false;
        
        while (halfNum < x) {
            halfNum = halfNum * 10 + (x % 10);
            x /= 10;
        }
        
        if (halfNum == x || halfNum / 10 == x)
            return true;
        else
            return false;
    }
}