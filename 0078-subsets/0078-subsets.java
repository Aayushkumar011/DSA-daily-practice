class Solution {
    public static void helper(int[] nums,List<List<Integer>> l,List<Integer> list,int index){
        if(index>=nums.length){
            l.add(new ArrayList<>(list));
            return ;
        }
        helper(nums,l,list,index+1);

        list.add(nums[index]);
        helper(nums,l,list,index+1);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        helper(nums,l,list,index);
    return l;
    }
}