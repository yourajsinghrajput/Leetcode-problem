class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        Integer max=Integer.MIN_VALUE;
        Integer min=Integer.MAX_VALUE;
      
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        res.add(min);
        res.add(max);
        return res;
    }
}
