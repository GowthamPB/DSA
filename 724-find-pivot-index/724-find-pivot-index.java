class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum=0,right_sum=0;
        for(int i=0;i<nums.length;i++){
            right_sum=0;
            if(i!=0){
                left_sum+=nums[i-1];
            }
            for(int j=i+1;j<nums.length;j++){
                right_sum+=nums[j];
            }
            if(left_sum==right_sum){
                    return i;
            }
        }
        return -1;
    }
}