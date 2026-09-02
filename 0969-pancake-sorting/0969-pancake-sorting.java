import java.util.*;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {

        List<Integer> ans = new ArrayList<>();

        for (int target = arr.length; target > 0; target--) {

            int index = 0;

            for (int i = 0; i < target; i++) {
                if (arr[i] == target) {
                    index = i;
                    break;
                }
            }
            if (index == target - 1) {
                continue;
            }
            if (index != 0) {
                reverse(arr, 0, index);
                ans.add(index + 1);
            }
            reverse(arr, 0, target - 1);
            ans.add(target);
        }

        return ans;
    }
    private void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}