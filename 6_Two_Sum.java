class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int dup=target-nums[i];
            if(map.containsKey(dup)){
                int[] arr={map.get(dup),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}