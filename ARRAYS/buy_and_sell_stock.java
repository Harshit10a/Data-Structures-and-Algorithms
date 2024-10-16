public class buy_and_sell_stock {
    public static int best_time(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                max_profit = Math.max(max_profit, profit);
            } else buyprice = prices[i];
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(best_time(price));
    }
}
