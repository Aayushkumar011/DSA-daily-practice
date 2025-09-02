class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int n = ans.size();
        int[] arr = new int[n];
        int i=0;
        for(int e : ans){
            arr[i] = e;
            i++;
        }
    return arr;
    }
}