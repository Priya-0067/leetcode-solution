// Last updated: 2/2/2026, 2:18:02 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int m=0,n=0;
        for(int i=0 ; i<=7 ; i++ ){
           for(int j=0 ; j<=7 ; j++ ){
            if(board[i][j] == 'R'){
                m = i;
                n = j;
               break;
            }
        } 
        }
        int c =0;
        for(int i=m ; i<=7 ; i++ ){
            if(board[i][n] =='B'){
               break;
            }
            else if(board[i][n] == 'p'){
               c++;
               break;             
            }
        }
        for(int i=m ; i>=0 ; i-- ){
             if(board[i][n] == 'B'){
               break;
            }
            else if(board[i][n] == 'p'){
                 c++;
                break;                
            }
        }
        for(int i=n ; i<=7 ; i++ ){
            if(board[m][i] == 'B'){
               break;
            }
            else if(board[m][i] == 'p'){
               c++;
               break;           
            }
        }
        for(int i=n ; i>=0 ; i-- ){
            if(board[m][i] == 'B'){
               break;
            }
            else if(board[m][i] == 'p'){
                 c++;
                 break;
                
            }
        }
        return c;
    }
}