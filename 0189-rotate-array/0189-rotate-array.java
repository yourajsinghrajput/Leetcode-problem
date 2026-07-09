class Solution {
    public void reverse(int[]arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
    public void rotate(int[] arr, int k) {
     k=k%arr.length;
     reverse(arr , 0,arr.length-1);
     reverse(arr,0,k-1);
     reverse(arr,k,arr.length-1);
    }
}