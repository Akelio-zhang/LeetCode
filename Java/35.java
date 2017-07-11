public class Solution {
    public int searchInsert(int[] nums, int target) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            if (target <= nums[i])
                return i;
        }
        return N;
    }
}