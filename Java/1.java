public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int[] index = new int[2];
        for (int i = 0; i < N; i++) {
            int num1 = nums[i];
            for (int j = i+1; j < N; j++) {
                if (num1 + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}