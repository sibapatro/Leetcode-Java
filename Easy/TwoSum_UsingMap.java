class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            if(hmap.containsKey(target-nums[i]))
                return new int[]{hmap.get(target-nums[i]),i};
            hmap.put(nums[i],i);
        }
        return new int[2];
    }
}
