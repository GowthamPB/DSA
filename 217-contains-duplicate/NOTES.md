**approach 1: sort and see if two adjacent elements are equal
TC: O(nlogn) SC: O(1)
**
​
**approach 2: add elements to the set. if set already contains element then duplicate exists
TC: O(n) SC: O(n)
**
**approach 3: add elements to the map. if map frequency is greater then 1 return true
TC: O(n) SC: O(n)**
​
**approach 4: using XOR property A^A=0 and 0^A=A
TC: O(n^2) SC: O(1)**
​
**approach 5: brute force
TC: O(n^2) SC: O(1)**
**Approach 6: using java stream api **
```
public class ContainsDuplicates {
​
/*approach 1: sort and see if two adjacent elements are equal
* TC: O(nlogn) SC: O(1)
* */
public boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++){// run loop till nums.length-1 otherwise
// you will get Indexoutofbound while doing nums[i]==nums[i+1] for last index
if(nums[i]==nums[i+1]){
return true;
}
}
return false;
}
​
/*approach 2: add elements to the set. if set already contains element then duplicate exists
* TC: O(n) SC: O(n)
* */
public boolean containsDuplicateApproach2(int[] nums) {
Set<Integer> set = new HashSet<>();