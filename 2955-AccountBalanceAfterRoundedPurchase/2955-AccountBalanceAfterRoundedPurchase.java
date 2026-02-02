// Last updated: 2/2/2026, 2:16:43 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int cut = Math.round(purchaseAmount / 10.0f) * 10; 
        return 100 - cut;
    }
}