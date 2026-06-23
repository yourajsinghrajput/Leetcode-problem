class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1] - position[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(position, m, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    private boolean isPossible(int[] position, int m, int dist) {
        int balls = 1;
        int lastPos = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= dist) {
                balls++;
                lastPos = position[i];
            }
        }
        return balls >= m;
    }
}