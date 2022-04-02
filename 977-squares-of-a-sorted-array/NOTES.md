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
​
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