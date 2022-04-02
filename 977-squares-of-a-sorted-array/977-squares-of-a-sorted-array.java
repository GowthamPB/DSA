class Solution {
   public int[] sortedSquares(int[] nums) {
	int[] squares = new int[nums.length];
	int left = 0, right = nums.length - 1, i;
	for (i = nums.length - 1; i >= 0; i--) {
		if (Math.abs(nums[right]) < Math.abs(nums[left])) {
			squares[i] = nums[left]*nums[left];
			left++;
		}
		else {
			squares[i] = nums[right]*nums[right];
			right--;
		}
	}
	return squares;
    }   
}