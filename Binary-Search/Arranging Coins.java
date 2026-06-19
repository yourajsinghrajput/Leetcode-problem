class Solution {
    public long sqrt(long n) {
        long lo = 1, hi = n;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid == n / mid)
                return mid;
            else if (mid > n / mid)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return hi;
    }
    public int arrangeCoins(int n) {
        return (int)((sqrt(8L * n + 1) - 1) / 2);
    }
}
