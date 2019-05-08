class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profit = []
        
        if len(prices) == 0: 
            return 0 
        else:
            for buy in range(0, len(prices)):
                for sell in range(buy, len(prices)):
                    profit.append(prices[sell] - prices[buy])
            return max(max(profit), 0)