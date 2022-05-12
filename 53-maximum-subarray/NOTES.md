**Brute-force approach**
```
class Solution {
public int maxSubArray(int[] nums) {
int max=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<nums.length;i++){
for(int j=i;j<nums.length;j++){
sum+=nums[j];
if(max<sum){
max=sum;
}
}
sum=0;
}
return max;
}
}
```