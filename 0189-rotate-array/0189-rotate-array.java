class Solution{
    public void rotate(int[] nums,int k){
        int n=nums.length;
        int count=0;
        for(int i=0;count<n;i++){
          int idx=i;
          int curr=nums[idx];
          do{
             int next = nums[(idx+k)%n];
             nums[(idx+k)%n]=curr;
             curr=next;
             idx=(idx+k)%n;
             count=count+1;
            }while (idx !=i);
        }
       
    }
}







































/*class Solution{
    public void rev(int []nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;


            start=start+1;
            end=end-1;
        }
    }
    public void rotate(int[]nums,int k){
        int n=nums.length;
        if(k%n==0){
            return;
        }
        k=k%n;

        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
}*/