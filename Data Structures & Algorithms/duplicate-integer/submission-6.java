class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> duplicate= new HashSet<>();
        //check if the value is in the hashset
        for (int i=0; i<nums.length;i++){
            if (duplicate.contains(nums[i]))
                return true;
            duplicate.add(nums[i]);
        }
        return false;
        //if not add to the set




















        // int[] dup= new int[nums.length];
        // for (int i=0; i<nums.length; i++){
        //     for (int j=0; j<i; j++){
        //         if (dup[j]==nums[i]){
        //             return true;
        //         }
        //     }
        //     dup[i]=nums[i];
        // }return false;


        
    }
}