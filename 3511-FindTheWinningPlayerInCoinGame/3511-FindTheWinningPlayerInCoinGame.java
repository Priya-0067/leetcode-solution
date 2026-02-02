// Last updated: 2/2/2026, 2:16:38 PM
class Solution {
    public String winningPlayer(int x, int y) {
         int turns = Math.min(x, y / 4);
        return (turns % 2 == 1) ? "Alice" : "Bob";
    }
}