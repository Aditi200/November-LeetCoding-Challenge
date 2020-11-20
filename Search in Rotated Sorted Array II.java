class Solution {
    public boolean search(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
               count=1;
            }
            
        }
        if(count==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}