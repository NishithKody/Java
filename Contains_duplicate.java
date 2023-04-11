class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                // System.out.println("Return false");
                return true;
                
            }
                
            
            set.add(nums[i]);
            // System.out.println(set);
        }

        return false;
        
    }
}
