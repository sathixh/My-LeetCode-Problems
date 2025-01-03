class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        
        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int validSplits = 0;
        long leftSum = 0;

        // Iterate through the array and check for valid splits
        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            // Check if the split is valid
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}
