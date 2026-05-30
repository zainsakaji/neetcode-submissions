class Solution {
    public int maxProfit(int[] prices) {
        //l= buy, r=se;;
        int l=0;
        int r=1;
        int maxProfit=0;


        while (r<prices.length){
            //potential profit
            if (prices[l]<prices[r]){
                maxProfit=Math.max(maxProfit, prices[r]-prices[l]);

            }
            
            else{l=r;}
            r++;
        } return maxProfit;     
    }
}
