class Solution {
    public int removeDuplicates(int[] nums) {
        int n =  nums.length;
        int i = 0;
        int j = 0;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
        
    }
}