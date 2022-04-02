**Using Sort method**
```
class Solution {
public int[] sortedSquares(int[] nums) {
for(int i=0;i<nums.length ; i++ ){
nums[i] = nums[i]*nums[i];
}
Arrays.sort(nums);
return nums;
}
}
```
**Using normal approach**
```
class Solution {
public int[] sortedSquares(int[] nums) {
int temp;
for(int i=0;i<nums.length;i++){
nums[i]=nums[i]*nums[i];
}
for(int i=0;i<nums.length;i++){
for(int j=0;j<nums.length;j++){
if(nums[i]<nums[j]){
temp=nums[j];
nums[j]=nums[i];
nums[i]=temp;
}
}
}
return nums;
}
}
```
**Using two-pointer approach**
```
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
```