class Solution {
    public int maxProfit(int[] prices) {
        int ma=0;
        int mi=prices[0];
        int l=prices.length;
        for(int i=0;i<l;i++){
            if(prices[i]<mi){
                mi=prices[i];
            }else{
                int pro=prices[i]-mi;
                if(ma<pro){
                    ma=pro;
                }
            }
        }
        return ma;
    }
}
