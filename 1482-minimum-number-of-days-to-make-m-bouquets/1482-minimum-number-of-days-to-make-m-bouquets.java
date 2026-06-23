class Solution {
    public boolean canMake(int[] bloomDay, int m, int k, int day) {
        int flowers = 0;
        int bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            lo = Math.min(lo, day);
            hi = Math.max(hi, day);
        }
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}