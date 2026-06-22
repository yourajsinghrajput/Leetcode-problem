class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int neg = firstGreaterEqual(nums, 0);
        int pos = n - firstGreater(nums, 0);
        return Math.max(neg, pos);
    }
    private int firstGreaterEqual(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    private int firstGreater(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
