class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
            int a[] = new int[nums.length + 1 ];
            
            for(int i:nums){
                a[i]=i;
            }

            List<Integer> res = new ArrayList<>();

            for(int j=1; j<a.length; j++ ){
                if(a[j]==0){
                    res.add(j);
                }
            }

            return res;
    }
}
