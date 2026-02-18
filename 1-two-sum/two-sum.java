class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int first,second = 0;
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<n;i++){
            first = nums[i];
            second = target - first;
            if(m.containsKey(second)){
                return new int[]{m.get(second), i};
            } 
            m.put(first, i);
        }
        return new int[]{};
    }
}