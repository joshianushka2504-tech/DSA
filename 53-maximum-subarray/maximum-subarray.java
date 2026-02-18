class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int st;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(st =0;st<n;st++){
            sum = sum + nums[st];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
        
    }
}