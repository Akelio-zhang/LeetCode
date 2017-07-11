public class Solution {
    public void nextPermutation(int[] nums) {
        int N = nums.length;
        if (N < 2)
            return;
        
        int[] pair = new int[2];
        pair[0] = 0;
        pair[1] = 0;
        int index = N - 1;
        while (index >= 1 && nums[index-1] >= nums[index])
            index--;
        if (index > 0)
            pair[0] = index - 1;
        
        index = N - 1;
        while (index >= 0 && nums[index] <= nums[pair[0]])
            index--;
        if (index > 0)
            pair[1] = index;
        
        if (pair[1] != 0) {
            swap(nums, pair[0], pair[1]);
            reverse(nums, pair[0]+1, nums.length-1);
        }
        else {
            reverse(nums, 0, nums.length-1);
        }
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private void reverse(int[] a, int head, int end) {
        int dist = (end - head)/2;
        for(int i = 0; i <= dist; i++) {
            swap(a, head+i, end-i);
        }
    }
}