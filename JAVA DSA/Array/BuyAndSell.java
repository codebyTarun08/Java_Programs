public class BuyAndSell {
    public static int maxProfit(int[] prices){
        int[] bestBuy=new int[100000];
        bestBuy[0]=Integer.MAX_VALUE;
        for(int i=1;i<prices.length-1;i++){
            bestBuy[i]=Math.min(bestBuy[i-1],prices[i-1]);
        }
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int currProfit=prices[i]-bestBuy[i];
            maxProfit=Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
