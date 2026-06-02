class Solution {
    void rearrange(ArrayList<Integer> arr) {
        //code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num : arr) {
            if(num >= 0) {
                pos.add(num);
            }
            else {
                neg.add(num);
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }
        while(i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }
        while(j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }
}
