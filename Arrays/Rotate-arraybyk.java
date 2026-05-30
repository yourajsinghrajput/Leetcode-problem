class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
        int t=n-k;

        helper(nums,t,n-1);
        helper(nums,0,t-1);
        helper(nums,0,n-1);
    }
    public void helper(int arr[],int s,int e){
        
        int t;
        while (s<e){
            t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}
