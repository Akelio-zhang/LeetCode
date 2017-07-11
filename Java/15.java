public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int N = nums.length;
        int target;
        int i, j;
        for (int index = 0; index < N-2; index++) {
            if (index != 0 && nums[index] == nums[index-1])
                continue;
            target = -nums[index];
            i = index + 1; j = N - 1;
            while (i < j && i<N && j<N) {
                if (nums[i] + nums[j] > target)
                    j--;
                else if (nums[i] + nums[j] < target)
                    i++;
                else if (i > index + 1 && nums[i] == nums[i-1]) {
                    i++;
                    continue;
                }
                    
                else {
                    List<Integer> ans = new ArrayList<Integer>();
                    ans.add(nums[index]);
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    result.add(ans);
                    i++;
					j--;
                }
                
            }
        }
        
        return result;
    }
}