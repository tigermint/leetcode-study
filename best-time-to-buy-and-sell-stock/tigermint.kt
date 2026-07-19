class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (price in prices) {
            minPrice = minOf(price, minPrice)
            maxProfit = maxOf(price - minPrice, maxProfit)
        }

        return maxProfit
    }
}
