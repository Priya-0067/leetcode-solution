// Last updated: 2/2/2026, 2:18:38 PM
class Solution {
    public int reverseBits(int n) {
        int a=0;
        for ( int i =0; i<32;i++) {
            a<<=1;
            a=(a|(n&1));
            n>>=1;
        }
        return a;
    }
}