// Last updated: 2/2/2026, 2:16:51 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;

        if( k <= numOnes + numZeros) return numOnes;

        return numOnes - (k - numOnes - numZeros);
    }
}