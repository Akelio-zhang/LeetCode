public class Solution {
    public boolean isValid(String s) {
        Stack<Character> char_st = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    char_st.push(')');
                    break;
                case '{':
                    char_st.push('}');
                    break;
                case '[':
                    char_st.push(']');
                    break;
                case ')':
                case '}':
                case ']':
                    if (char_st.empty())
                        return false;
                    if (!char_st.pop().equals(c))
                        return false;
                    break;
                default:
                    return false;
            }
        }
        if (char_st.empty())
            return true;
        else
            return false;
    }
}