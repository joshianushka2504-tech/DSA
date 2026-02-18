class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]!=0){
                nums[nonzero++] = nums[i];
            }
            
        }
        while(nonzero <n){
            nums[nonzero++] = 0;
        }
    }
}