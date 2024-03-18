import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int presum =0; int cnt =0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            presum = presum + nums[i];
            int remove = presum - k;
            
            cnt = cnt + mp.getOrDefault(remove, 0);
            
            mp.put(presum, mp.getOrDefault(presum,0)+1);
        }
        return cnt;
       }
}