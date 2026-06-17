class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;
        for (int num : nums) {
            totalOnes += num;
        }
        if (totalOnes <= 1) {
            return 0;
        }
        int currOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            currOnes += nums[i];
        }
        int maxOnes = currOnes;
        for (int i = totalOnes; i < n + totalOnes; i++) {
            currOnes += nums[i % n];
            currOnes -= nums[(i - totalOnes) % n];
            maxOnes = Math.max(maxOnes, currOnes);
        }
        return totalOnes - maxOnes;
    }
}
