class Solution {
    public boolean hasDuplicate(int[] nums) {

        int[] dup= new int[nums.length];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<i; j++){
                if (dup[j]==nums[i]){
                    return true;
                }
            }
            dup[i]=nums[i];
        }return false;
        
    }
}