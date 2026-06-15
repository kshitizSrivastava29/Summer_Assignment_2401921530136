class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++){
            map.put(nums2[i],i);
        }
        for(int i = 0 ; i < nums1.length ; i++){
            int idx = map.get(nums1[i]) +1;
            int nge = -1;
            while(idx < nums2.length){
                if(nums2[idx] > nums1[i]){
                    nge = nums2[idx];
                    break;
                }
                idx++;
            }
            nums1[i] = nge;
        }
        return nums1;
    }
}
