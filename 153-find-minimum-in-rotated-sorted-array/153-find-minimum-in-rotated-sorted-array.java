class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
               return nums[i+1];
           }
       }
        return ans;
    }
}