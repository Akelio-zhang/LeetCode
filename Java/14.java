public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int N = strs.length;
        if (N == 0)
            return "";
        int i = 1;
        int minSize = strs[0].length();
        while (i < N) {
            if (strs[i].length() < minSize)
                minSize = strs[i].length();
            i++;
        }
        
        i = 0;
        while (i < minSize) {
            char c = strs[0].charAt(i);
            int i_str = 1;
            boolean flag = true;
            while (i_str < N) {
                if (strs[i_str].charAt(i) != c) {
                    flag = false;
                    break;
                }
                i_str++;
            }
            if (flag == false)
                break;
            i++;
        }
        return strs[0].substring(0,i);
    }
}