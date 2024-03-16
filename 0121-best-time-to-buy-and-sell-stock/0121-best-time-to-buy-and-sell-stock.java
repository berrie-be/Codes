class Solution {
    public int maxProfit(int[] prices) {
        int temp = Integer.MAX_VALUE;
        int diff =0;
        int maxprof =0;
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]< temp)
            {
                temp = prices[i];
            }
                diff = prices[i]-temp;
                if(maxprof<diff)maxprof=diff;
            
        }
        return maxprof;
    }
}