class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2]; // Correct array initialization

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start j at i + 1
                if (nums[i] + nums[j] == target) { // Use == for comparison
                    ans[0] = i;
                    ans[1] = j;
                    return ans; // Return immediately after finding the solution
                }
            }
        }
        return ans; // Fallback (though ideally, a solution is guaranteed)
    }
}
