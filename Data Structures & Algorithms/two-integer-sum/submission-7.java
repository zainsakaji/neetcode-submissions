class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map= new HashMap<>();

        for (int k=0; k<nums.length; k++){
            map.put(nums[k], k);

        }
        for (int i=0; i<nums.length; i++){
            int j= target-nums[i];
            if (map.containsKey(j) && map.get(j)!=i){
                return new int[]{i, map.get(j)};
            }
        }
        return new int[]{};
        
    }
}
