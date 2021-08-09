class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            int price = prices[i];
            if(price< min) min=price;
            else if(price-min>maxProfit) maxProfit = price-min;
        }
        return maxProfit;
        
    }
}
