class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>n/2)
            {
                res=entry.getKey();
            }
        }
        return res;

        
    }
}
