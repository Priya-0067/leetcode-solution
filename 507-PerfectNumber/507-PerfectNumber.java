// Last updated: 2/2/2026, 2:18:08 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
         int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
                sum = sum + i;
        }
        
        return sum == num;
    }
}