class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     Arrays.sort(arr);
     List<List<Integer>> ans =new ArrayList<>();
     int minDiff=Integer.MAX_VALUE;
     for(int i=0;i<arr.length-1;i++){
       int diff=arr[i+1]-arr[i];
       if(diff<minDiff){
        minDiff=diff;
        ans.clear();
        ans.add(Arrays.asList(arr[i],arr[i+1]));
       }
       else if(diff==minDiff){
        ans.add(Arrays.asList(arr[i],arr[i+1]));
       }
     }
     return ans;
    }
}
/*class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr){
   Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if(diff < minDiff) {
                minDiff = diff;
            }
        }
        for(int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if(diff == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        }
        return ans;

    }
}*/
