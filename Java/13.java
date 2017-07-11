public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int N = s.length();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            switch(s.charAt(i)) {
                case 'M':
                    num[i] = 1000;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'I':
                    num[i] = 1;
                    break;
            }
        }
		
        int i = 0;
        while (i < N-1) {
            if (num[i] >= num[i+1])
                result += num[i];
            else
                result -= num[i];
            i++;
        }
        return result + num[N-1];
    }
}