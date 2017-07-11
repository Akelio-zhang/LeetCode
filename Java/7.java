public class Solution {
    public int reverse(int x) {
        int result = 0;
        int num;
        int newResult;
        while (x != 0) {
            num = x % 10;
            newResult = result * 10 + num;
            if ((newResult - num)/10 != result)
                return 0;
            result = newResult;
            x /= 10;
        }
        return result;
    }
}