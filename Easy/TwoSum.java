class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        int i,j=0;
        outer :
        for( i=0;i<nums.length-1;i++){
            for( j = i+1;j <nums.length ;j++){
                if(nums[i]+nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    break outer;
                }
                    
            }
        }
        return ret;
    }
}
